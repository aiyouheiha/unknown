package com.heiha.unknown.learning.jgit;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.RemoteAddCommand;
import org.eclipse.jgit.api.Status;
import org.eclipse.jgit.api.errors.*;
import org.eclipse.jgit.dircache.DirCache;
import org.eclipse.jgit.lib.Ref;
import org.eclipse.jgit.lib.StoredConfig;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.transport.RemoteConfig;
import org.eclipse.jgit.transport.URIish;
import org.omg.CORBA.PRIVATE_MEMBER;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Set;

/**
 * <br>
 * <b>Project:</b> unknown<br>
 * <b>Date:</b> 2017/5/27 15:46<br>
 * <b>Author:</b> heiha<br>
 */
public class GitUtil {
    private Git git;
    private File dir;
    private Remote remote = new Remote();
    private Config config = new Config();

    public GitUtil(File dir) throws IOException {
        this.dir = dir;
        if (dir.exists()) {
            this.git = Git.open(dir);
        }
    }

    public Git init() throws GitAPIException {
        this.git = Git.init().setDirectory(dir).call();
        return this.git;
    }

    public DirCache add(String filepattern) throws GitAPIException {
        return git.add().addFilepattern(filepattern).call();
    }

    public RevCommit commit(String message) throws GitAPIException {
        return git.commit().setMessage(message).call();
    }

    public Status status(String path) throws GitAPIException {
        return git.status().addPath(path).call();
    }

    public Status status() throws GitAPIException {
        return git.status().call();
    }

    public Remote remote() {
        return remote;
    }

    public Config config() {
        config.setStoredConfig(git.getRepository().getConfig());
        return config;
    }

    public class Remote {
        public RemoteConfig add(String name, URIish uri) throws GitAPIException {
            RemoteAddCommand remote = git.remoteAdd();
            remote.setName(name);
            remote.setUri(uri);
            return remote.call();
        }

        public Collection<Ref> show() throws GitAPIException {
            return git.lsRemote().call();
        }

        public Collection<Ref> show(String remote) throws GitAPIException {
            return git.lsRemote().setRemote(remote).call();
        }

        @Override
        public String toString() {
            try {
                return remote.show().toString();
            } catch (GitAPIException e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    public class Config {
        private User user = new User();
        private StoredConfig storedConfig;

        public void setStoredConfig(StoredConfig storedConfig) {
            this.storedConfig = storedConfig;
        }

        public User user() {
            return user;
        }

        public class User {
            public String name() {
                return storedConfig.getString("user", null, "name");
            }

            public String email() {
                return storedConfig.getString("user", null, "email");
            }

            public void name(String name) throws IOException {
                storedConfig.setString("user", null, "name", name);
                storedConfig.save();
            }

            public void email(String email) throws IOException {
                storedConfig.setString("user", null, "email", email);
                storedConfig.save();
            }
        }
    }


}

