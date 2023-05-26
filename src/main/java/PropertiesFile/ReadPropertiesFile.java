package PropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
    public static String PropFile(String PropName) throws IOException, IOException {
        FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\PropertiesFile\\PracticeProjectPropertiesFile.properties");
        Properties property = new Properties();
        property.load(fs);
        return property.getProperty(PropName);


    }
}