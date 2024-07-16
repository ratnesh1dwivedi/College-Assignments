public class PBLsignal{
    public static void main(String[] args) {
        String signalColor="red";
        int signalDuration = 10;
        int signalCountdown = signalDuration;
        while(true){
            //display current signal color and countdown
            System.out.println("Signal:"+signalColor+" "+signalCountdown);
            //decrement countdown and switch signal if necessary
            if(signalCountdown>0){
                signalCountdown--;
            }
            else{
                if (signalColor.equals("red")){
                        signalColor="green";
                }
                else if
                (signalColor.equals("green")){
                    signalColor="yellow";
                }
                else if
                (signalColor.equals("yellow")){
                    signalColor="red";
                }
                signalCountdown=signalDuration;
            }
            //wait for one second before next iteration
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
