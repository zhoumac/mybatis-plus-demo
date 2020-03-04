import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.PostgreSqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @Author 周希来
 * @Date 2019/12/2 17:20
 */
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = Application.class)
@Data
@Slf4j
public class CodeGeneratorTwo {

    final static String  path = System.getProperty("user.dir");
    final static String  modelPath = System.getProperty("user.dir")+"/src/main/java/com/zhou/model/vo/req/";
    final static String  xmlPath = System.getProperty("user.dir")+"/src/main/resources/xml/";
    public static void main(String[] args) {
        generateCode();
    }

    /**
     * 配置生成的策略
     * 默认不替换
     */
   // @Test
    public static   void generateCode() {
        //设置需要生成的表
        String author = "周希来";
        String[] tables ={"uk_user"};
        //String packagePath = "C:/myProject/net/SpringBoot_MybatisPlus/src/test/";
        //String[] tables = codeTwoGeneratorConfig.getTables().split(",");

        //获取数据库连接
        String dbUrl = "jdbc:mysql://114.55.92.111:3306/zhou?useUnicode=true&allowMultiQueries=true";
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)
                .setUrl(dbUrl)
                .setUsername("root")
                .setPassword("123456")
                //.setDriverName("com.mysql.jdbc.Driver");
                .setDriverName("com.mysql.cj.jdbc.Driver"); //mysql 8.0以上版本
               // .setSchemaName("poit_cloud");

        //类型转换
        dataSourceConfig.setTypeConvert(new PostgreSqlTypeConvert() {
        /*    @Override
            public PropertyInfo processTypeConvert(GlobalConfig globalConfig, String fieldType) {
                System.out.println("转换类型：" + fieldType);
                // 注意！！processTypeConvert 存在默认类型转换，如果不是你要的效果请自定义返回、非如下直接返回。
             *//*   if (fieldType.contains("numeric")) {
                    return DbColumnType.DOUBLE;
                } else {
                    return super.processTypeConvert(globalConfig, fieldType);
                }*//*
            }*/
        });
        //生成策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        // strategy.setInclude(new String[] { "user" }); // 需要生成的表
        // strategy.setExclude(new String[]{"test"}); // 排除生成的表
        // 自定义实体父类
        // strategy.setSuperEntityClass("com.baomidou.demo.TestEntity");
        // 自定义实体，公共字段
        // strategy.setSuperEntityColumns(new String[] { "test_id", "age" });
        strategyConfig
               // .setCapitalMode(true)
                //.setLogicDeleteFieldName("rec_status")
                .setNaming(NamingStrategy.underline_to_camel)
                .setEntityBuilderModel(true)
                .setTablePrefix(new String[] { "t_", "sys_","u_","m_" ,"uk_"})
                //.setInclude("configDesc","dataCommodity")//修改替换成你需要的表名，多个表名传数组
                .setEntityLombokModel(true)//是否使用lombok
        ;
        if(!Objects.isNull(tables)&&tables.length>0) {
            strategyConfig.setInclude(tables);
        }
        //全局配置
        GlobalConfig config = new GlobalConfig();
        config.setActiveRecord(true)
                .setAuthor(author)
                .setOutputDir("src/main/java")
                .setIdType(IdType.AUTO)//主键类型
                .setFileOverride(false)//文件是否覆盖
                .setServiceName("%sService")
                .setSwagger2(false)//生成swagger文档
                .setEnableCache(true)//二级缓存
                .setBaseColumnList(true)//columList
                .setBaseResultMap(true)//ResultMap
        ;

        InjectionConfig ic = new InjectionConfig() {
            @Override
            public void initMap() {
                this.setMap(getMap());
            }
        };
        TemplateConfig tc = new TemplateConfig();
        tc.setServiceImpl(null)
                .setXml(null)
                .setController("template/controller.java.vm")
                .setEntity("template/entity.java.vm")
                .setService("template/service.java.vm");


        List<FileOutConfig> foc = new ArrayList<>();
        foc.add(new FileOutConfig("/templates/mapper.xml.vm") {
            // 自定义输出文件目录
            @Override
            public String outputFile(TableInfo tableInfo) {
                return xmlPath + tableInfo.getEntityName() + ".xml";
            }
        });
        //添加add 请求对象
        foc.add(new FileOutConfig("/template/addVo.java.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return modelPath+ "Add" + tableInfo.getEntityName() + "Req"
                        + StringPool.DOT_JAVA;
            }
        });
        //添加update 请求对象
        foc.add(new FileOutConfig("/template/updateVo.java.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return  modelPath+"Update" + tableInfo.getEntityName() + "Req"
                        + StringPool.DOT_JAVA;
            }
        });
        //添加list请求对象
        foc.add(new FileOutConfig("/template/listVo.java.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return  modelPath+ "List" + tableInfo.getEntityName() + "Req"
                        + StringPool.DOT_JAVA;
            }
        });
        //添加分页请求对象
        foc.add(new FileOutConfig("/template/pageVo.java.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return  modelPath + "Page" + tableInfo.getEntityName() + "Req"
                        + StringPool.DOT_JAVA;
            }
        });
        ic.setFileOutConfigList(foc);
        new AutoGenerator()
                .setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setTemplate(tc)
                .setCfg(ic)
                .setPackageInfo(
                        new PackageConfig()
                                .setParent( "com.zhou" )
                                .setController("controller")
                                .setEntity("entity")
                ).execute();
    }
}