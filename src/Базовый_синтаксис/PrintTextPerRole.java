package Базовый_синтаксис;

import java.util.HashMap;

public class PrintTextPerRole {
    public static void main(String[] args) {
        PrintTextPerRole ptr = new PrintTextPerRole();
        ptr.printTextPerRole(new String[] {"Городничий", "Аммос Федорович", "Артемий Филиппович",
                "Лука Лукич"}, new String[]{"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам " +
                "пренеприятное известие: к нам едет ревизор.", "Аммос Федорович: Как ревизор?", "Артемий Филиппович: " +
                "Как ревизор?", "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!", "Артемий Филиппович: Вот не было заботы, так подай!", "Лука Лукич: " +
                "Господи боже! еще и с секретным предписаньем!"});
    }
    private String printTextPerRole(String[] roles, String[] textLines) {
        long s = System.currentTimeMillis();
        String result1 = "";
        HashMap<String, String> map = new HashMap();
        for (int i=0; i< roles.length; i++) {
            String result = roles[i] +":\n";
            for (int j=0; j< textLines.length; j++) {
                if (textLines[j].substring(0, textLines[j].indexOf(":")).equals(roles[i])) {
                    map.put(roles[i],textLines[j].replace(roles[i] + ":", j + 1 + ")"));
                    result += map.get(roles[i]) + "\n";
                }
            }
            result1 += result + "\n";
        }
        System.out.println(System.currentTimeMillis() - s);
        return result1;
    }
}




