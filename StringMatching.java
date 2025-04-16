// Source code is decompiled from a .class file using FernFlower decompiler.
public class StringMatching {
    public StringMatching() {
    }
 
    public static int bruteForceStringMatch(String var0, String var1) {
       int var2 = var0.length();
       int var3 = var1.length();
 
       for(int var4 = 0; var4 <= var2 - var3; ++var4) {
          int var5;
          for(var5 = 0; var5 < var3 && var0.charAt(var4 + var5) == var1.charAt(var5); ++var5) {
          }
 
          if (var5 == var3) {
             return var4;
          }
       }
 
       return -1;
    }
 }
 