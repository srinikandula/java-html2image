package gui.ava.html;

import gui.ava.html.image.HtmlImageGenerator;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;
import java.net.URL;

/**
 * Created by hki on 07-01-2016.
 */
public class Example {

    public static void main(String[] args) throws FileNotFoundException {
        URL url = ResourceUtils.getURL("classpath:id_card_template.html");
        HtmlImageGenerator imageGenerator = new HtmlImageGenerator();
        imageGenerator.loadUrl(url);
        imageGenerator.saveAsImage("id_card.png");
        imageGenerator.saveAsImage("id_card.jpeg");
        //imageGenerator.saveAsHtmlWithMap("hello-world.html", "hello-world.png");
    }
}
