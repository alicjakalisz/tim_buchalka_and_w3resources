package alicja.examples.singapour.authorandbooks;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class TestAuthor {
    public static void main(String[] args) {
        Author ahTeck = new Author ("Tan Ah Teck", "ahteck@nowhere.com",'m');
        System.out.println(ahTeck);
        ahTeck.getEmail();
        System.out.println(ahTeck.getEmail());
        ahTeck.setEmail("blablabla");
        System.out.println(ahTeck.getEmail());
    }


}
