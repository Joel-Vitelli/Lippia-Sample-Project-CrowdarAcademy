package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static lippia.web.constants.AutomationPracticeConstants.*;

public class AutomationPracticeService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clickMyAccount(){
        click(BTN_MYACCOUNT_ID);
    }

    public static void competarUsername(String username){
        setInput(INPUT_USERNAME_ID, username);
    }

    public static void competarPassword(String pass){
        setInput(INPUT_PASSWORD_ID, pass);
    }

    public static void clickLoginBtn(){
        click(BTN_LOGIN_XPATH);
    }

    public static void verificarLogin(){
        Assert.assertTrue(isVisible(BTN_LOGOUT_XPATH));
    }
}
