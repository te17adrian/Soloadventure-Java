public class solomvc {
    public static void main(String[] args) {
        soloview theView = new soloview();
        solomodel theModel = new solomodel();
        solocontroller theController = new solocontroller(theView,theModel);
        theView.setVisible(true);
    }
}
