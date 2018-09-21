public class Ex1 {

    class ObjectHandler {

        int objectID;

        public ObjectHandler() {}

        public boolean insertObjectOnList(List<ObjectHandler> objectHandlers, ObjectHandler objectHandler) {
            if(objectHandlers.add(objectHandler))
                return true;
            else
                return false;
        }

        @Override
        public int compareTo(Object o) {
            return this.objectID.compareTo(o.objectID);
        }

        @Override
        public String toString() {
            return "Object [Id=" + objectID + "]";
        }

        public void crescOrderList(List<ObjectHandler> objectHandlers){
            Collections.sort(objectHandlers);
            System.out.println(objectHandlers);
        }
    }





    public static void main (String [] args){
        System.out.println("Hello World");
    }
}