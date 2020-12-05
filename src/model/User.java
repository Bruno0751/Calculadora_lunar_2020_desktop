package model;
//calendario_lunar
import javax.swing.JOptionPane;
/**
 *
 * @author Bruno Gressler da Silveira
 * @version 1
 * @since 23/11/2020
 */
public class User {
    
    private String StringName;
    private byte byteDay, byteMonth;

    public String getStringName() {
        return StringName;
    }

    public void setStringName(String StringName) {
        this.StringName = StringName;
    }

    public byte getByteDay() {
        return byteDay;
    }

    public void setByteDay(byte byteDay) {
        this.byteDay = byteDay;
    }

    public byte getByteMonth() {
        return byteMonth;
    }

    public void setByteMonth(byte byteMonth) {
        this.byteMonth = byteMonth;
    }
    
    public String calcularLua(byte day, byte month){
        String stringAnswer = null;

        switch(month){
            case 1://31
                
                if(day >= 3 && day <= 9){
                    stringAnswer = "Lua Crescente";
                }else if(day >= 10 && day <= 16){
                    stringAnswer = "Lua Cheia";
                }else if(day >= 17 && day <= 23){
                    stringAnswer = "Lua Minguante";
                }else{
                    stringAnswer = "Lua Nova";
                }
                break;
            case 2:
                //29

                if(day >= 1 && day <= 8){
                    stringAnswer = "Lua Crescente";
                }else if(day >= 9 && day <= 14){
                    stringAnswer = "Lua Cheia";
                }else if(day >= 15 && day <= 22){
                        stringAnswer = "Lua Minguante";
                }else{
                        stringAnswer = "Lua Nova";
                }
                break;
            case 3:
                //31
                if(day >= 2 && day <= 8){
                    stringAnswer = "Lua Crescente";
                }else if(day >= 9 && day <= 15){
                    stringAnswer = "Lua Cheia";
                }else if(day >= 16 && day <= 23){
                    stringAnswer = "Lua Minguante";
                }else{
                    stringAnswer = "Lua Nova";
                }
                break;
            case 4:
                //30
                if(day >= 1 && day <= 6){
                    stringAnswer = "Lua Crescente";
                }else if(day >= 7 && day <= 13){
                    stringAnswer = "Lua Cheia";
                }else if(day >= 14 && day <= 21){
                    stringAnswer = "Lua Minguante";
                }else if(day >= 22 && day <= 29){
                    stringAnswer = "Lua Nova";
                }else{
                    stringAnswer = "Lua Crescente";
                }
                break;

            case 5:
                //31
                if(day >= 7 && day <= 13){
                    stringAnswer = "Lua Cheia";
                }else if(day >= 14 && day <= 21){
                    stringAnswer = "Lua Minguante";
                }else if(day >= 22 && day <= 29){
                    stringAnswer = "Lua Nova";
                }else{
                    stringAnswer = "Lua Crescente";
                }
                break;
            case 6:
                //30
                if(day >= 5 && day <= 12){
                    stringAnswer = "Lua Cheia";
                }else if(day >= 13 && day <= 20){
                    stringAnswer = "Lua Minguante";
                }else if(day >= 21 && day >= 27){
                    stringAnswer = "Lua Nova";
                }else{
                    stringAnswer = "Lua Crescente";
                }
                break;
            case 7:
                //31
                if(day >= 5 && day <= 11){
                    stringAnswer = "Lua Cheia";
                }else if(day >= 12 && day <= 19){
                    stringAnswer = "Lua Minguante";
                }else if(day <= 20 && day <= 26){
                    stringAnswer = "Lua Nova";
                }else{
                    stringAnswer = "Lua Crescente";
                }
                break;
                
                //
                //
                //a partir daqui
                
                
                
            case 8:
                //31
                if(day >= 3 && day <= 10){
                    stringAnswer = "Lua Cheia";
                }else if(day >= 11 && day <= 17){
                    stringAnswer = "Lua Minguante";
                }else if(day >= 18 && day <= 24){
                    stringAnswer = "Lua Nova";
                }else{
                    stringAnswer = "Lua Crescente";
                }
                break;
            case 9:
                //30
                if(day >= 2 && day <= 19){
                    stringAnswer = "Lua Cheia";
                }else if(day >= 10 && day <= 16){
                    stringAnswer = "Lua Minguante";
                }else if(day >= 17 && day <= 24){
                    stringAnswer = "Lua Nova";
                }else{
                    stringAnswer = "Lua Crescente";
                }
                break;
            case 10:
                //31
                if(day >= 1 && day <= 8){
                    stringAnswer = "Lua Cheia";
                }else if(day >= 9 && day <= 15){
                    stringAnswer = "Lua Minguante";
                }else if(day >= 16 && day <= 22){
                    stringAnswer = "Lua Nova";
                }else if(day >= 23 && day <= 30){
                    stringAnswer = "Lua Crescente";
                }else{
                    stringAnswer = "Lua Cheia";
                }
                break;
            case 11:
                //30
                if(day >= 8 && day <= 14){
                    stringAnswer = "Lua Minguante";
                }else if(day >= 15 && day <= 21){
                    stringAnswer = "Lua Nova";
                }else if(day >= 22 && day <= 29){
                    stringAnswer = "Lua Crescente";
                }else{
                    stringAnswer = "Lua Cheia";
                }
                break;
            case 12:
                //31
                if(day >= 7 && day <= 13){
                    stringAnswer = "Lua Minguante";
                }else if(day >= 14 && day <= 19){
                    stringAnswer = "Lua Nova";
                }else if(day >= 21 && day <= 29){
                    stringAnswer = "Lua Crescente";
                }else{
                    stringAnswer = "Lua Cheia";
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Mês Inválido", "ERRO", JOptionPane.ERROR_MESSAGE);
                break;
        }
        
        return stringAnswer;
    }
    
    @Override
    public String toString(){
        return "Nome: " + this.StringName + "\n"
                + "Dia: " + this.byteDay + "\n"
                + "Mês: " + this.byteMonth + "\n\n"
                + "Lua: " + calcularLua(byteDay, byteMonth);
    }
    
}
