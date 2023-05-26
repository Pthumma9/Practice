package SeleniumCode;

import BaseClass.Openbrowser;
import PropertiesFile.ReadPropertiesFile;
import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT01_NavigateNassert {
    @Test
    public void NavToGghome () throws IOException {
        Openbrowser.NavToWeb(ReadPropertiesFile.PropFile("GDhomePage"));
        Openbrowser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void AssertTitle(){
        String ActualTitle = Openbrowser.driver.getTitle();
        System.out.println("GgTitle:"+ActualTitle);
        String ExpectedTitle="The Good Guys - Online Electrical & Home Appliances";
        Assert.assertEquals(ExpectedTitle,ActualTitle);
        Openbrowser.CloseBrowser();
    }
}
