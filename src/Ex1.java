public class Ex1 {

    class ObjectHandler {

        int objectId = null;
        String objectStringId = null;

        public ObjectHandler(int o) { this.objectId = o;}

        public ObjectHandler(String o) { this.objectStringId = o;}

        public boolean insertObjectOnList(List<ObjectHandler> objectHandlers, ObjectHandler objectHandler) {
            if(objectHandlers.add(objectHandler))
                return true;
            else
                return false;
        }

        @Override
        public int compareTo(Object o) {
            if(o.objectId != null) {
                return this.objectID.compareTo(o.objectID);
            } else {
                return this.objectStringId.compareTo(o.objectStringId);
            }
        }

        @Override
        public String toString() {
            f(o.objectId != null) {
                return "Object [Id=" + objectId + "]";
            } else {
                return "Object [" + StringId=" + objectStringId + "]";
            }

        }

        public void crescOrderList(List<ObjectHandler> objectHandlers){
            Collections.sort(objectHandlers);
        }

        public void printObjectHandlerList(List<ObjectHandler> objectHandlers){
            System.out.println(objectHandlers);
        }
    }


    public static void main (String [] args){
        System.out.println("Hello World");
    }
}