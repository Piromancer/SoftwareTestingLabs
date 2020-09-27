package taskParts.part2;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class BinomialQueueTests {
    private BinomialQueue intQ, charQ;

    // Getting heap's structure through reflection
    private BinomialQueue.BinomialNode[] getTreeRoots(BinomialQueue bq) throws NoSuchFieldException,
            SecurityException, IllegalArgumentException, IllegalAccessException{
        Field field = bq.getClass().getDeclaredField("theTrees");
        if (Modifier.isPrivate(field.getModifiers())) {
            field.setAccessible(true);
        }
        return (BinomialQueue.BinomialNode[]) field.get(bq);
    }

    @Before
    public void createQueues(){
        intQ = new BinomialQueue<Integer>();
        charQ = new BinomialQueue<Character>();
    }

    // Insert tests //
    @Test
    public void test_forEmptyIntegerQueue_insert_addsCorrectValue() throws NoSuchFieldException, IllegalAccessException {
        intQ.insert(3);
        BinomialQueue.BinomialNode[] bq = getTreeRoots(intQ);
        Assertions.assertEquals(bq[0].element, 3);
    }

    @Test
    public void test_forEmptyCharQueue_insert_addsCorrectValue() throws NoSuchFieldException, IllegalAccessException {
        charQ.insert('3');
        BinomialQueue.BinomialNode[] bq = getTreeRoots(charQ);
        Assertions.assertEquals(bq[0].element, '3');
    }

    @Test
    public void test_forNonEmptyIntegerQueue_insert_addsCorrectValue_inCorrectOrder() throws NoSuchFieldException, IllegalAccessException {
        intQ.insert(5);
        intQ.insert(3);
        BinomialQueue.BinomialNode[] bq = getTreeRoots(intQ);
        Assertions.assertEquals(bq[1].leftChild.element, 5);
    }

    @Test
    public void test_forEmptyCharQueue_insert_addsCorrectValue_inCorrectOrder() throws NoSuchFieldException, IllegalAccessException {
        charQ.insert('5');
        charQ.insert('3');
        BinomialQueue.BinomialNode[] bq = getTreeRoots(charQ);
        Assertions.assertEquals(bq[1].leftChild.element, '5');
    }

    @Test
    public void test_forEmptyIntegerQueue_insert16385Values_DoesNotBreak() throws NoSuchFieldException, IllegalAccessException {
        for(int i = 0; i < 16385; i++)
            intQ.insert(i);
        BinomialQueue.BinomialNode[] bq = getTreeRoots(intQ);
        Assertions.assertEquals(bq[0].element, 16384);
    }

    // Parametrized constructor tests //
    @Test
    public void test_IntegerBinomialQueue_parametrizedConstruction() throws NoSuchFieldException, IllegalAccessException {
        BinomialQueue<Integer> intQ2 = new BinomialQueue<>(5);
        BinomialQueue.BinomialNode[] bq = getTreeRoots(intQ2);
        Assertions.assertEquals(bq[0].element, 5);
    }

    @Test
    public void test_CharBinomialQueue_parametrizedConstruction() throws NoSuchFieldException, IllegalAccessException {
        BinomialQueue<Character> charQ2 = new BinomialQueue<>('5');
        BinomialQueue.BinomialNode[] bq = getTreeRoots(charQ2);
        Assertions.assertEquals(bq[0].element, '5');
    }


    // DeleteMin tests //
    @Test
    public void test_deleteMin_onEmptyQueue(){
        Assertions.assertThrows(Exception.class, () -> intQ.deleteMin());
    }

    @Test
    public void test_deleteMin_onCharacterQueue_deletesCorrectValueAndRebuildsHeap() throws Exception {
        charQ.insert('5');
        charQ.insert('3');
        charQ.deleteMin();
        BinomialQueue.BinomialNode[] bq = getTreeRoots(charQ);
        Assertions.assertEquals(bq[0].element, '5');
    }

    @Test
    public void test_deleteMin_onIntegerQueue_deletesCorrectValueAndRebuildsHeap() throws Exception {
        intQ.insert(5);
        intQ.insert(3);
        intQ.deleteMin();
        BinomialQueue.BinomialNode[] bq = getTreeRoots(intQ);
        Assertions.assertEquals(bq[0].element, 5);
    }

    @Test
    public void test_deleteMin_onIntegerQueue_returnsCorrectValue() throws Exception {
        intQ.insert(1);
        intQ.insert(5);
        intQ.insert(3);
        Assertions.assertEquals(intQ.deleteMin(), 1);
    }

    @Test
    public void test_running_deleteMin_twice_onIntegerQueue_deletesTwoTimes() throws Exception {
        intQ.insert(1);
        intQ.insert(5);
        intQ.insert(3);
        intQ.deleteMin();
        intQ.deleteMin();
        BinomialQueue.BinomialNode[] bq = getTreeRoots(intQ);
        Assertions.assertEquals(bq[0].element, 5);
    }

    // findMin tests //

    @Test
    public void test_findMin_onEmptyQueue_throwsException() throws Exception {
        Assertions.assertThrows(Exception.class, () -> intQ.findMin());
    }

    @Test
    public void test_findMin_FindsMinimalElementInIntegerQueue() throws Exception {
        intQ.insert(5);
        intQ.insert(1);
        intQ.insert(3);
        Assertions.assertEquals(intQ.findMin(), 1);
    }

    @Test
    public void test_findMin_FindsMinimalElementInCharQueue() throws Exception {
        charQ.insert('5');
        charQ.insert('1');
        charQ.insert('3');
        Assertions.assertEquals(charQ.findMin(), '1');
    }

    // isEmpty tests //
    @Test
    public void test_isEmpty_returnsTrueOnEmptyQueue() throws Exception {
        Assertions.assertEquals(intQ.isEmpty(), true);
    }

    @Test
    public void test_isEmpty_returnsFalseOnFilledQueue() throws Exception {
        intQ.insert(5);
        intQ.insert(1);
        intQ.insert(3);
        Assertions.assertEquals(intQ.isEmpty(), false);
    }

    // makeEmpty tests //
    @Test
    public void test_makeEmpty_DoesNotThrowOnEmptyQueue() throws Exception {
        Assertions.assertDoesNotThrow(() -> intQ.makeEmpty());
    }

    @Test
    public void test_makeEmpty_ClearsQueue() throws Exception {
        intQ.insert(5);
        intQ.insert(1);
        intQ.insert(3);
        intQ.makeEmpty();
        BinomialQueue.BinomialNode[] bq = getTreeRoots(intQ);
        Assertions.assertEquals(bq[0], null);
    }

    // merge tests //

    @Test
    public void test_merge_OnTwoEmptyQueues_ReturnsEmptyQueue() throws Exception {
        intQ.merge(new BinomialQueue());
        BinomialQueue.BinomialNode[] bq = getTreeRoots(intQ);
        Assertions.assertEquals(bq[0], null);
    }

    @Test
    public void test_merge_OnEmptyQueueAndPassingFilledQueue_ReturnsFilledQueue() throws Exception {
        intQ.merge(new BinomialQueue(2));
        BinomialQueue.BinomialNode[] bq = getTreeRoots(intQ);
        Assertions.assertEquals(bq[0].element, 2);
    }

    @Test
    public void test_merge_OnFilledQueueAndPassingEmptyQueue_ReturnsFilledQueue() throws Exception {
        intQ.insert(2);
        intQ.merge(new BinomialQueue());
        BinomialQueue.BinomialNode[] bq = getTreeRoots(intQ);
        Assertions.assertEquals(bq[0].element, 2);
    }

    @Test
    public void test_merge_OnFilledQueueAndPassingFilledQueue_ReturnsFilledQueue() throws Exception {
        intQ.insert(2);
        intQ.insert(1);
        intQ.merge(new BinomialQueue(3));
        BinomialQueue.BinomialNode[] bq = getTreeRoots(intQ);
        Assertions.assertEquals(bq[0].element, 3);
        Assertions.assertEquals(bq[1].element, 1);
    }

}
