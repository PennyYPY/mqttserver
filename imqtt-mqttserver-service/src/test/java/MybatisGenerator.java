import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.ShellException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MybatisGenerator
 * @Description
 * @Date 2019/1/11 下午5:06
 * @Created by yupeiying
 */
public class MybatisGenerator {

    public static void main(String[] args) throws IOException, XMLParserException, InvalidConfigurationException, InterruptedException, SQLException {
        generate();
    }
    public static void generate() throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {

        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File file = new File("generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(file);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite){
            @Override
            public File getDirectory(String targetProject, String targetPackage) throws ShellException {
                System.out.println();
                return super.getDirectory(targetProject, targetPackage);
            }
        };
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);

    }

}
