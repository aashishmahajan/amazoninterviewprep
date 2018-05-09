package prep1.randomquestions;

import java.util.*;

public class calc {

    static class Object {
        String upc;
        String code;
        String categories;
        float price;
        float couponOff;

        public Object(String upc, String code, String categories, float price, float couponOff) {
            this.upc = upc;
            this.code = code;
            this.categories = categories;
            this.price = price;
            this.couponOff = couponOff;
        }
    }
    public static void main(String[] args) {
        List<Map<String, Object>> coupons = new LinkedList<>();
        Map<String, Object>  keyObject = new LinkedHashMap<>();
        Object item  = new Object("1","1","baby",11.2f , 2.4f);
        Object item2  = new Object("1","1","shampoo",11.2f , 2.4f);
        Object item3  = new Object("1","1","kid",11.2f , 2.4f);
        Object item4  = new Object("12","12","tailor",121.2f , 40.4f);
        Object item5  = new Object("11","11","shirt",111.2f , 30.4f);
        keyObject.put("baby",item);
        keyObject.put("shampoo",item2);
        keyObject.put("kid",item3);
        keyObject.put("tailor",item4);
        keyObject.put("shirt",item5);

        coupons.add(keyObject);

        List<String> couponPreferred =new LinkedList<>();
        couponPreferred.add("kid");couponPreferred.add("baby");couponPreferred.add("shirt");
        processPreferredCopon(coupons, couponPreferred);
    }

    private static void processPreferredCopon(List<Map<String, Object>> coupons, List<String> couponPreferred) {
        List<Map<String, Object>> couponsV = new LinkedList<>();
        Map<String, Float> dicountMap = new HashMap<>();
        Map<String, Object> validC = new LinkedHashMap<>();
        for(int i=0; i < coupons.size(); i ++){
            for(String key : coupons.get(i).keySet()){
                if(couponPreferred.indexOf(coupons.get(i).get(key).categories)>-1){
                    float disc = calDisc(coupons.get(i).get(key).price,coupons.get(i).get(key).couponOff);
                    dicountMap.put(coupons.get(i).get(key).upc+coupons.get(i).get(key).code, disc);
                    validC.put(key,coupons.get(i).get(key));
                }
            }
        }
        couponsV.add(validC);
        List<Map.Entry<String, Float>> list = new LinkedList<Map.Entry<String, Float>>(dicountMap.entrySet());
        Collections.sort( list, new Comparator<Map.Entry<String, Float>>() {
            public int compare(Map.Entry<String, Float> o1, Map.Entry<String, Float> o2) {
                return (o1.getValue()).compareTo( o2.getValue() );
            }
        });
        Map<String, Float> result = new LinkedHashMap<String, Float>();
        for (Map.Entry<String, Float> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        /*for(key)*/

    }
    private static float calDisc(float price, float discountamount){
        if(price == discountamount){
            return 0.0f;
        }else{
            return (float)((discountamount *100)/price);
        }
    }
}
