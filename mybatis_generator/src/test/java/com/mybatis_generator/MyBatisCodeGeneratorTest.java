package com.mybatis_generator;

import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangluping on 2018/5/22.
 */
public class MyBatisCodeGeneratorTest{

    @Test
    public void genMybatisCode() throws Exception {
        List<String> warnings = new ArrayList<>();
        boolean overwrite = true;
        // 加载test-classes下的配置文件/代表classpath(Test)
        System.out.println(MyBatisCodeGeneratorTest.class.getResource("").getPath());
        File configFile = new File(MyBatisCodeGeneratorTest.class.getResource("/mybatis/generator/generator-config.xml").getFile());
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
                callback, warnings);
        myBatisGenerator.generate(null);
    }
}
