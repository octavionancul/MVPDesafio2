package cl.octavionancul.mvpdesafio2;

public class PassEvaluator {

    private PassCallback callback;

    public PassEvaluator(PassCallback callback) {
        this.callback = callback;
    }


    public void passEvaluator(String value){

        if(value.trim().length()>0){

        String result;

            if(value.trim().length()>8){

                result="La password tiene mas de 8 caracteres";
            }else{

                result="La password tiene 8 o menos caracteres";
            }
            callback.passResult(result);

        }else{

            callback.blankInput();
        }

    }
}
