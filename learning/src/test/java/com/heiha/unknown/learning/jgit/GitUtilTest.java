package com.heiha.unknown.learning.jgit;

import com.alibaba.fastjson.JSON;
import org.eclipse.jgit.api.errors.GitAPIException;
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
        this.strDir = "./jgitTestRepo/test";
        this.git = new GitUtil(new File(strDir));
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testInit() throws Exception {
        git.init();
    }

    @Test
    public void testStatus() throws Exception {
        System.out.println(JSON.toJSONString(git.status()));
    }

    @Test
    public void testAdd() throws Exception {
        System.out.println(JSON.toJSONString(git.add(".")));
    }

    @Test
    public void testCommit() throws Exception {
        System.out.println(JSON.toJSONString(git.commit("add readme")));
    }
}