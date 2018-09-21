public class Ex1 {

    class ObjectHandler {

        IntHandler objectId = null;
        StringHandler objectStringId = null;

        public ObjectHandler(IntHandler o) { this.objectId = o;}

        public ObjectHandler(StringHandler o) { this.objectStringId = o;}

        public boolean insertObjectOnList(List<ObjectHandler> objectHandlers, ObjectHandler objectHandler) {
            if(objectHandlers.add(objectHandler))
                return true;
            else
                return false;
        }

        @Override
        public int compareTo(Object o) {
            if(o.objectId != null) {
                return this.objectID.intHandlerId.compareTo(o.objectID.intHandlerId);
            } else {
                return this.objectStringId.stringHandlerId.compareTo(o.objectStringId.stringHandlerId);
            }
        }

        @Override
        public String toString() {
            f(o.objectId != null) {
                return "Object [Id=" + objectId.intHandlerId + "]";
            } else {
                return "Object [StringId=" + objectStringId.stringHandlerId + "]";
            }

        }

        public void crescOrderList(List<ObjectHandler> objectHandlers){
            Collections.sort(objectHandlers);
        }

        public void printObjectHandlerList(List<ObjectHandler> objectHandlers){
            System.out.println(objectHandlers);
        }
    }

    class IntHandler() {
        int intHandlerId;

        public IntHandler(){

        }
    }

    class StringHandler() {
        String stringHandlerId;

        public StringHandler(){

        }
    }

    public static void main (String [] args){
    }
}