 class Mobile{

        void refreshRate(){
            System.out.println("Maximum in the market is : 144Hz");
        }
    }
    class Motorola extends Mobile{

        void model(){
            System.out.println("MotoEdge 50 is new model which is available in market");
        }
    }
    class Main extends Motorola{

        public static void main(String args[]){

            Motorola m = new Motorola();
            m.model();
            m.refreshRate();
        }
    }

