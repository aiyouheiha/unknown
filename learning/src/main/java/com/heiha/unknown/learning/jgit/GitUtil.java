package com.heiha.unknown.learning.jgit;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.Status;
import org.eclipse.jgit.api.errors.AbortedByHookException;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.NoMessageException;
import org.eclipse.jgit.api.errors.WrongRepositoryStateException;
import org.eclipse.jgit.dircache.DirCache;
import org.eclipse.jgit.lib.StoredConfig;
import org.eclipse.jgit.revwalk.RevCommit;

import java.io.File;
import java.io.IOException;

/**
 * <br>
 * <b>Project:</b> unknown<br>
 * <b>Date:</b> 2017/5/27 15:46<br>
 * <b>Author:</b> heiha<br>
 */
public class GitUtil {
    private Git git;
    private File dir;

    public GitUtil(File dir) throws IOException {
        this.dir = dir;
        if (dir.exists()) {
            this.git = Git.open(dir);
        }
    }

    public void init() throws GitAPIException {
        this.git = Git.init().setDirectory(dir).call();
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
}

