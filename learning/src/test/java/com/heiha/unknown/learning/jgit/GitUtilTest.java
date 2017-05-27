package com.heiha.unknown.learning.jgit;

import com.alibaba.fastjson.JSON;
import com.heiha.unknown.common.util.PrintUtil;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.transport.URIish;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

/**
 * <br>
 * <b>Project:</b> unknown<br>
 * <b>Date:</b> 2017/5/27 16:11<br>
 * <b>Author:</b> heiha<br>
 */
public class GitUtilTest {
    private GitUtil git;
    private String strDir;

    @Before
    public void setUp() throws Exception {
        this.strDir = "./jgitTestRepo/heiha_test";
        this.git = new GitUtil(new File(strDir));
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testInit() throws Exception {
        PrintUtil.printJsonString(git.init());
    }

    @Test
    public void testStatus() throws Exception {
        PrintUtil.printJsonString(git.status());
    }

    @Test
    public void testAdd() throws Exception {
        PrintUtil.printJsonString(git.add("."));
    }

    @Test
    public void testCommit() throws Exception {
        PrintUtil.printJsonString(git.commit("add readme"));
    }

    @Test
    public void testRemote() throws Exception {
        URIish uri = new URIish();
        uri.setHost("https://github.com");
        uri.setPath("/aiyouheiha/heiha-test.git");
        PrintUtil.printJsonString(git.remote().add("origin", uri));
    }

    @Test
    public void testConfig() throws Exception {
        PrintUtil.printJsonString(git.config().user().name());
        PrintUtil.printJsonString(git.config().user().email());
        git.config().user().name("heiha");
        git.config().user().email("aiyouheiha@163.com");
        PrintUtil.printJsonString(git.config().user().name());
        PrintUtil.printJsonString(git.config().user().email());
    }
}