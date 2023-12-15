public class LabTest2 {

    public class FabricProperty{
        protected String fabricType;
        protected double fabricWeight;
        protected float fabricThickness;
        protected int fabricWidth;
        protected String fabricColour;

        public FabricProperty(){
            fabricType ="";
            fabricWeight=0;
            fabricThickness=0;
            fabricWidth=0;
            fabricColour ="";
        }

        public FabricProperty(String fabricType, double fabricWeight, float fabricThickness, int fabricWidth, String fabricColour){
            this.fabricType =fabricType;
            this.fabricWeight =fabricWeight;
            this.fabricThickness=fabricThickness;
            this.fabricWidth=fabricWidth;
            this.fabricColour =fabricColour;
        }

        public FabricProperty(FabricProperty fprop){
            fabricType =fprop.fabricType;
            fabricWeight=fprop.fabricWeight;
            fabricThickness=fprop.fabricThickness;
            fabricWidth=fprop.fabricWidth;
            fabricColour =fprop.fabricColour;
        }

        public String getFabricType() {
            return fabricType;
        }

        public void setFabricType(String fabricType) {
            this.fabricType = fabricType;
        }

        public double getFabricWeight() {
            return fabricWeight;
        }

        public void setFabricWeight(double fabricWeight) {
            this.fabricWeight = fabricWeight;
        }

        public float getFabricThickness() {
            return fabricThickness;
        }

        public void setFabricThickness(float fabricThickness) {
            this.fabricThickness = fabricThickness;
        }

        public int getFabricWidth() {
            return fabricWidth;
        }

        public void setFabricWidth(int fabricWidth) {
            this.fabricWidth = fabricWidth;
        }

        public String getFabricColour() {
            return fabricColour;
        }

        public void setFabricColour(String fabricColour) {
            this.fabricColour = fabricColour;
        }

        public void Show() {
            System.out.println("FabricProperty{" +
                    "fabricType='" + fabricType + '\'' +
                    ", fabricWeight=" + fabricWeight +
                    ", fabricThickness=" + fabricThickness +
                    ", fabricWidth=" + fabricWidth +
                    ", fabricColour='" + fabricColour + '\'' +
                    '}');
        }
    }

    public class Velvet extends FabricProperty{
        private double yarnPercentage;
        private String velvetType;


        //default constructor
        public Velvet (){

            yarnPercentage =0.0;
            velvetType ="";
        }

        //primary constructor
        public Velvet(String fabricType,double fabricWeight, float fabricThickness, int fabricWidth, String fabricColour, double yarnPercentage, String velvelType){
            super(fabricType,fabricWeight, fabricThickness, fabricWidth, fabricColour);
            this.yarnPercentage = yarnPercentage;
            this.velvetType = velvelType;
        }

        //copy constructor
        public Velvet(Velvet vlv){
            super(vlv.fabricType,vlv.fabricWeight, vlv.fabricThickness, vlv.fabricWidth, vlv.fabricColour);
            yarnPercentage = vlv.yarnPercentage;
            velvetType = vlv.velvetType;
        }

        public double getYarnPercentage() {
            return yarnPercentage;
        }

        public void setYarnPercentage(double yarnPercentage) {
            this.yarnPercentage = yarnPercentage;
        }

        public String getVelvetType() {
            return velvetType;
        }

        public void setVelvetType(String velvetType) {
            this.velvetType = velvetType;
        }


        public void Display() {
            System.out.println("Velvet{" +
                    "yarnPercentage=" + yarnPercentage +
                    ", velvetType='" + velvetType + '\'' +
                    ", fabricType='" + fabricType + '\'' +
                    ", fabricWeight=" + fabricWeight +
                    ", fabricThickness=" + fabricThickness +
                    ", fabricWidth=" + fabricWidth +
                    ", fabricColour='" + fabricColour + '\'' +
                    '}');
        }
    }

    public class Cotton extends FabricProperty{
        private double fiberDiameter;
        private boolean elasticRecovery;
        private float cottonPercentage;

        //default constructor
        public Cotton(){
            fiberDiameter = 0.0;
            elasticRecovery =true;
            cottonPercentage =0;
        }

        //primary constructor
        public Cotton(String fabricType,double fabricWeight, float fabricThickness, int fabricWidth, String fabricColour, double fiberDiameter, boolean elasticRecovery, float cottonPercentage){
            super(fabricType,fabricWeight, fabricThickness, fabricWidth, fabricColour);
            this.fiberDiameter = fiberDiameter;
            this.cottonPercentage=cottonPercentage;
            this.elasticRecovery=elasticRecovery;
        }

        //copy constructor
        public Cotton(Cotton cttn){
            super(cttn.fabricType,cttn.fabricWeight, cttn.fabricThickness, cttn.fabricWidth, cttn.fabricColour);
            fiberDiameter = cttn.fiberDiameter;
            cottonPercentage = cttn.cottonPercentage;
            elasticRecovery = cttn.elasticRecovery;
        }

        public double getFiberDiameter() {
            return fiberDiameter;
        }

        public void setFiberDiameter(double fiberDiameter) {
            this.fiberDiameter = fiberDiameter;
        }

        public boolean isElasticRecovery() {
            return elasticRecovery;
        }

        public void setElasticRecovery(boolean elasticRecovery) {
            this.elasticRecovery = elasticRecovery;
        }

        public float getCottonPercentage() {
            return cottonPercentage;
        }

        public void setCottonPercentage(float cottonPercentage) {
            this.cottonPercentage = cottonPercentage;
        }

        public void Display() {
            System.out.println("Cotton{" +
                    "fiberDiameter=" + fiberDiameter +
                    ", elasticRecovery=" + elasticRecovery +
                    ", cottonPercentage=" + cottonPercentage +
                    ", fabricType='" + fabricType + '\'' +
                    ", fabricWeight=" + fabricWeight +
                    ", fabricThickness=" + fabricThickness +
                    ", fabricWidth=" + fabricWidth +
                    ", fabricColour='" + fabricColour + '\'' +
                    '}');
        }
    }



    public static void main(String[] args){

    }

}
