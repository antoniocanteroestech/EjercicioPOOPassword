package es.estech;

public class Password {

    private int mLength = 8;
    private String mPassword;

    public Password() {
    }

    public Password(int mLength) {
        this.mLength = mLength;
        this.mPassword = generateRandomPassword(this.mLength);
    }


    public void setmLength(int mLength) {
        this.mLength = mLength;
    }

    public int getmLength() {
        return mLength;
    }

    public String getmPassword() {
        return mPassword;
    }

    public boolean esFuerte(){

        if (this.mPassword.length() < 11) return false;
        int lower = 0;
        int upper = 0;
        int digit = 0;
        for (int i = 0; i < mPassword.length(); i++){
            if (Character.isUpperCase(mPassword.charAt(i))) upper++;
            if (Character.isLowerCase(mPassword.charAt(i))) lower++;
            if (Character.isDigit(mPassword.charAt(i))) digit++;
        }

        if (lower > 1 && upper > 2 && digit > 5) return true;

        return false;
    }

    public String generateRandomPassword(int mLength) {

        String keys="0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz";//un String es un array de tipo char
        String password = "";//antes de empezar a generar el password debemos inicializarlo vacío
        for(int i = 0; i < mLength; i++){//generamos un bucle que se repita tantas veces como longitud queremos que tenga nuestra password
            password += keys.charAt((int)(Math.random()*keys.length()));//por cada iteración añadimos al password una posición aleatoria de keys al password
        }
        return password;
    }


}
