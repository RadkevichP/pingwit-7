package pl.pingwit.lec_10.stringUtils;

import org.apache.commons.lang3.StringUtils;
import pl.pingwit.lec_8.point_1.AppleGadget;
import pl.pingwit.lec_8.point_1.GadgetTypes;

public class UtilsMain {

    public static void main(String[] args) {

        String abba = "";

        System.out.println(StringUtils.isBlank(abba));

        AppleGadget appleGadget = new AppleGadget(null, GadgetTypes.SMARTPHONE, null, 64);

        /*if (appleGadget.getImei() != null) {
            System.out.println(appleGadget.getImei().isBlank());
        }*/
        System.out.println(StringUtils.isEmpty(appleGadget.getImei()));

    }
}
