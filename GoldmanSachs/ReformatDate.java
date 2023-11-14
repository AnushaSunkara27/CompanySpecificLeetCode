package GoldmanSachs;

import java.util.HashMap;

public class ReformatDate {
    public String reformatDate(String date) {
        HashMap<String, Integer> months = new HashMap<>();
        String[] monthsArray = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int monthCount = 1;
        for(String i: monthsArray) {
            months.put(i,monthCount);
            monthCount += 1;
        }

        String[] givenDate = date.split(" ");
        String d = givenDate[0].substring(0, givenDate[0].length()-2);
        if(Integer.parseInt(d) <= 9) {
            d = 0+d;
        }
        String m = String.valueOf(months.get(givenDate[1]));
        if(Integer.parseInt(m) <= 9) {
            m = 0+m;
        }
        String year = givenDate[2];

        return year+'-'+m+'-'+d;

    }


    public static void main(String[] args) {
        ReformatDate obj = new ReformatDate();
        System.out.println(obj.reformatDate("20th Oct 2052"));

    }
}
