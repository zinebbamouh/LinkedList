public class CellList {
//Inner class:
    class CellNode implements Cloneable {
        private CellPhone cpObj;
        private CellNode cnObj;

    //Default constructor for CellNode:
        public CellNode() {
            this.cpObj = null;
            this.cnObj = null;
        }
    
    //Parameterized constructor for CellNode:
        public CellNode(CellPhone cp, CellNode cn) {
            this.cpObj = cp;
            this.cnObj = cn;
        }
    //Copy constructor for CellNode:
        public CellNode(CellNode cn) {
            this.cpObj = cn.cpObj;
            this.cnObj = cn.cnObj;
        }
    //Clone() methode implementing Cloneable interface:
        public CellNode clone() {
            try {
                CellNode cnode = (CellNode)super.clone();
                cnode.cpObj = this.cpObj.clone();
                cnode.cnObj = this.cnObj.clone();
                return cnode;
            }
            catch(CloneNotSupportedException e) {
                System.out.println("Cannot clone CellNode");
                return null;
            }
        }
    //Getter method:
        public CellPhone getCellPhone() {
            return this.cpObj;
        }
        public CellNode getCellNode() {
            return this.cnObj;
        }

    //Setter method:
        public void setCellPhone(CellPhone cp) {
            this.cpObj = cp;
        }
        public void setCellNode(CellNode cn) {
            this.cnObj = cn;
        }
    }

//Contain of outer class:
    private CellNode head;
    private int size;

//Default constructor which creates an empty list:
    public CellList() {
        head = null;
        size = 0;
    }
//Copy constructor:
    public CellList(CellList cl) {
        
    }
//addToStart method:
    public void addToStart(CellPhone cp) {

    }
//
}
