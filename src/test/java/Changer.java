public class Changer {
    public String change(int number) {

        MyNumber myNumber = new MyNumber();
        myNumber.setRoman("");
        myNumber.setArabic(number);

        String[] romans = {"I","V","X","L","C","D","M"};
        int max = 100;

        for(int i=romans.length-1;i>=1;){
            String r = romans[i];
            String r1 = romans[i-1];
            String r2 = romans[i-2];
            myNumber = setNumber(myNumber,r,10*max);
            myNumber = setNumber(myNumber,r2+r,9*max);
            myNumber = setNumber(myNumber,r1,5*max);
            myNumber = setNumber(myNumber,r2+r1,4*max);
            i = i-2;
            max = max/10;

        }
        myNumber = setNumber( myNumber,"I",1);


        return myNumber.getRoman();
    }

    private MyNumber setNumber(MyNumber myNumber, String romans, int arabic) {
        while (myNumber.getArabic() >= arabic) {
            myNumber.setRoman(myNumber.getRoman().concat(romans));
            myNumber.setArabic(myNumber.getArabic()-arabic);
        }
        return myNumber;
    }

}
