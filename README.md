# producer-consumer-generics-semaphore

**Problem** :  
To make sure that the producer won’t try to add data into the buffer if it’s full and that the consumer won’t try to remove data from an empty buffer.

**Solution** :  
The producer will start producing an item and will add the same into the Queue. It will keep checking that whether queue becomes full or not, if it is full then 
producer will stop adding an item and wait for queue to have some space (or have the consumer consumed some item from the queue).
On the other hand Consumer keeps watching the Queue to have some items in it for consume, otherwise till that time consumer keeps waiting for an item to be there in the queue.


The producer will add an item in queue and notify the consumer to consume it. If the consumer consume the item and it will notify the producer to start producing more item and vice versa if producer add an item, it will notify the consumer to start consuming it.
