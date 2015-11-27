import com.lopiter.parser.MyParser;
import com.lopiter.parser.ParseException;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by lopiter on 2015-11-27.
 */
public class MyParserTest {

    @Test
    public void ParserTest() throws FileNotFoundException, ParseException {
        MyParser parser = new MyParser(new FileInputStream("test.txt"));
        parser.function();
    }

}
