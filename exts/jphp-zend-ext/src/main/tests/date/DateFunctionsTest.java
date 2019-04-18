package date;

import org.develnext.jphp.zend.ZendJvmTestCase;
import org.develnext.jphp.zend.ext.standard.DateConstants;
import org.develnext.jphp.zend.ext.standard.DateFunctions;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.MethodSorters;

import php.runtime.Memory;
import php.runtime.env.TraceInfo;

@RunWith(JUnit4.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DateFunctionsTest extends ZendJvmTestCase {
    @Test
    public void testcheckdate() {
        check("ext/date/checkdate_basic1.phpt");
        check("ext/date/006.phpt");
    }

    @Test
    public void testgetdate() {
        check("ext/date/008.phpt");
    }

    @Test
    public void teststrftime() {

        // check("ext/date/gmstrftime_variation3.phpt");

        // prinf or sscanf bug
        // check("ext/date/gmstrftime_variation15.phpt");
        // check("ext/date/gmstrftime_variation16.phpt");

        check("ext/date/gmstrftime_variation5.phpt");
        check("ext/date/009.phpt");
        check("ext/date/gmstrftime_basic.phpt");
        check("ext/date/gmstrftime_variation20.phpt");
        check("ext/date/gmstrftime_variation4.phpt");
        check("ext/date/gmstrftime_variation6.phpt");
        check("ext/date/gmstrftime_variation7.phpt");
        check("ext/date/gmstrftime_variation8.phpt");
        check("ext/date/gmstrftime_variation9.phpt");
        check("ext/date/gmstrftime_variation10.phpt");
        check("ext/date/gmstrftime_variation11.phpt");
        check("ext/date/gmstrftime_variation13.phpt");
        check("ext/date/gmstrftime_variation14.phpt");
        check("ext/date/gmstrftime_variation17.phpt");
        check("ext/date/gmstrftime_variation18.phpt");
        check("ext/date/gmstrftime_variation19.phpt");
        check("ext/date/gmstrftime_variation21.phpt");
        check("ext/date/gmstrftime_variation22.phpt");
    }

    @Test
    public void testlocaltime() {
        check("ext/date/007.phpt");
        check("ext/date/localtime_basic.phpt");
        check("ext/date/localtime_variation4.phpt");
        check("ext/date/localtime_variation5.phpt");
    }

    @Test
    public void testDate() {
        check("ext/date/003.phpt");
        check("ext/date/004.phpt");
    }

    @Test
    public void testDateDefaultTimezoneGet() {
        check("ext/date/date_default_timezone_get-1.phpt");
        check("ext/date/date_default_timezone_get-2.phpt");
        check("ext/date/date_default_timezone_get-3.phpt");
        check("ext/date/date_default_timezone_get-4.phpt");
    }

    @Test
    public void testMkTime() {
        check("ext/date/mktime-1.phpt");
        check("ext/date/mktime_basic1.phpt");
        check("ext/date/mktime-3-64bit.phpt");
        check("ext/date/mktime_no_args.phpt");
        check("ext/date/gmmktime_basic.phpt");
        //check("ext/date/big_year.phpt");
    }

    @Test
    public void testDateCreate() {
        check("ext/date/date_create-2.phpt");
        check("ext/date/date_create-1.phpt");
        check("ext/date/date_create_basic.phpt");
        check("ext/date/date_create_from_format_basic2.phpt");

        //check("ext/date/date_create-relative.phpt");
    }

    @Test
    public void strtotime() {
        check("ext/date/strtotime2.phpt");
        check("ext/date/002.phpt");
        check("ext/date/strtotime.phpt");
        check("ext/date/strtotime3-64bit.phpt");
        check("ext/date/strtotime-mysql.phpt");
        check("ext/date/strtotime_basic2.phpt");
    }

    @Test
    public void strtotimeRelative() {
        check("ext/date/strtotime-relative.phpt");
    }

    @Test
    @Ignore
    public void testDateDefaultTimezoneSet() {
        check("ext/date/date_default_timezone_set-1.phpt");
        check("ext/date/date_default_timezone_set_error.phpt");
    }

    @Test
    @Ignore
    public void testTimezoneAbbreviationsList() {
        check("ext/date/010.phpt");
    }

    @Test
    @Ignore
    public void testTimezoneNameFromAbbr() {
        check("ext/date/011.phpt");
    }
}
