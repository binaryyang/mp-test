package edu.neuq.mptest.script;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;

import java.nio.file.Paths;
import java.util.Collections;

public class MpGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/test",
                        "root", "1234")
                .globalConfig(builder -> builder
                        .author("SheepHappy")
                        .outputDir(Paths.get(System.getProperty("user.dir")) + "/src/main/java")
                        .commentDate("yyyy-MM-dd")
                )
                .packageConfig(builder -> builder
                        .parent("edu.neuq.mptest")
                        .entity("entity")
                        .mapper("mapper")
                        .service("service")
                        .serviceImpl("service.impl")
                        // 添加pathInfo配置，指定XML文件的输出路径
                        .pathInfo(Collections.singletonMap(OutputFile.xml,
                                Paths.get(System.getProperty("user.dir")) + "/src/main/resources/mapper"))
                )
                .strategyConfig(builder -> builder
                        .addInclude("order")
                        .entityBuilder()
                        .enableLombok()
                )
                .templateEngine(new VelocityTemplateEngine())
                .execute();
    }
}
