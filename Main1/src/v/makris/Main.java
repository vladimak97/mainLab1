package v.makris;

public class Main1 {

    public static <ObjectMapper> void main(String[] args) throws IOException {
        String json = "{\"imie\":\"Vlad\",\"nazwisko\":\"Makris\"}";
        ObjectMapper objectMapper = new ObjectMapper();

        User user = objectMapper.readValue(json, User.class);

        System.out.print(user.getImie() + " ");
        System.out.print(user.getNazwisko() );
    }
}