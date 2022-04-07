import java.util.HashMap;

class Registers{
    public static HashMap<String, String> registerMap;
    public static HashMap<String , String> registerMap2;
    static{
        registerMap = new HashMap<>();

        registerMap.put("", "00000");
        registerMap.put("$zero", "00000");
        registerMap.put("$at", "00001");
        registerMap.put("$v0", "00010");
        registerMap.put("$v1", "00011");
        registerMap.put("$a0", "00100");
        registerMap.put("$a1", "00101");
        registerMap.put("$a2", "00110");
        registerMap.put("$a3", "00111");
        registerMap.put("$t0", "01000");
        registerMap.put("$t1", "01001");
        registerMap.put("$t2", "01010");
        registerMap.put("$t3", "01011");
        registerMap.put("$t4", "01100");
        registerMap.put("$t5", "01101");
        registerMap.put("$t6", "01110");
        registerMap.put("$t7", "01111");
        registerMap.put("$s0", "10000");
        registerMap.put("$s1", "10001");
        registerMap.put("$s2", "10010");
        registerMap.put("$s3", "10011");
        registerMap.put("$s4", "10100");
        registerMap.put("$s5", "10101");
        registerMap.put("$s6", "10110");
        registerMap.put("$s7", "10111");
        registerMap.put("$t8", "11000");
        registerMap.put("$t9", "11001");
        registerMap.put("$k0", "11010");
        registerMap.put("$k1", "11011");
        registerMap.put("$gp", "11100");
        registerMap.put("$sp", "11101");
        registerMap.put("$fp", "11110");
        registerMap.put("$ra", "11111");

    }

    static{
        registerMap2 = new HashMap<>();

       // registerMap2.put( "00000","");
        registerMap2.put( "00000","$zero");
        registerMap2.put( "00001","$at");
        registerMap2.put( "00010","$v0");
        registerMap2.put( "00011","$v1");
        registerMap2.put( "00100","$a0");
        registerMap2.put( "00101","$a1");
        registerMap2.put( "00110","$a2");
        registerMap2.put( "00111","$a3");
        registerMap2.put( "01000","$t0");
        registerMap2.put( "01001","$t1");
        registerMap2.put( "01010","$t2");
        registerMap2.put( "01011","$t3");
        registerMap2.put( "01100","$t4");
        registerMap2.put( "01101","$t5");
        registerMap2.put( "01110","$t6");
        registerMap2.put( "01111","$t7");
        registerMap2.put( "10000","$s0");
        registerMap2.put( "10001","$s1");
        registerMap2.put( "10010","$s2");
        registerMap2.put( "10011","$s3");
        registerMap2.put( "10100","$s4");
        registerMap2.put( "10101","$s5");
        registerMap2.put( "10110","$s6");
        registerMap2.put( "10111","$s7");
        registerMap2.put( "11000","$t8");
        registerMap2.put( "11001","$t9");
        registerMap2.put( "11010","$k0");
        registerMap2.put( "11011","$k1");
        registerMap2.put( "11100","$gp");
        registerMap2.put( "11101","$sp");
        registerMap2.put( "11110","$fp");
        registerMap2.put( "11111","$ra");

    }
    //Allows us to find and get the register.
    public String get(String register){
        return registerMap.get(register);
    }
    public String get_dis(String register){
        return registerMap2.get(register);
    }
    public void setValue(String register, String value){
        registerMap.replace(register, value);
    }

}