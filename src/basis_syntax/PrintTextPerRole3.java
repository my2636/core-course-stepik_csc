package basis_syntax;

public class PrintTextPerRole3 {
    public static void main(String[] args) {
        PrintTextPerRole3 ptr3 = new PrintTextPerRole3();
        ptr3.printTextPerRole2(new String[] {"Городничий", "Аммос Федорович", "Артемий Филиппович",
                "Лука Лукич", "Nobody"}, new String[]{"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам " +
                "пренеприятное известие: к нам едет ревизор.", "Аммос Федорович: Как ревизор?", "Артемий Филиппович: " +
                "Как ревизор?", "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!", "Артемий Филиппович: Вот не было заботы, так подай!", "Лука Лукич: " +
                "Господи боже! еще и с секретным предписаньем!"});
    }
    private String printTextPerRole2(String[] roles, String[] textLines) {
        long s = System.currentTimeMillis();
        StringBuilder result1 = new StringBuilder("");
        for (int i=0; i< roles.length; i++) {
            StringBuilder res = new StringBuilder(roles[i]).append(":\n");
            for (int j=0; j< textLines.length; j++) {
                String sub = textLines[j].substring(0, textLines[j].indexOf(":"));
                if (sub.equals(roles[i])) {
                    res = res.append(textLines[j].replaceFirst(sub + ":", j + 1 + ")") + "\n");
                }
            }
            result1 = result1.append(res + "\n");
        }
        System.out.println(System.currentTimeMillis() - s);
        System.out.println(result1);
        return result1.toString();
    }
}
