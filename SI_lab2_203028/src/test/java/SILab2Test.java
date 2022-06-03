import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
    private List<String> createEmptyList(){
        return new ArrayList<>();
    }
    private List<String> createList(String... elems){
        return new ArrayList<>(Arrays.asList(elems));
    }
    //baranje 4
    @Test
    void TestEveryStatement() {
        // list.size < 0  vo jazli:1,2,3, 26
        List<String> emptyList = createEmptyList();
        RuntimeException isklucok;
        isklucok = assertThrows(RuntimeException.class, () -> SILab2.function(emptyList));
        assertTrue(isklucok.getMessage().contains("List length should be greater than 0"));
      //Gi pominuva jazlite:1,2,4,5,6,7,26
       List<String>lista=createList("0","#","0");
       isklucok = assertThrows(RuntimeException.class, () -> SILab2.function(lista));
       assertTrue(isklucok.getMessage().contains("List length should be a perfect square"));
       //Gi pominuva jazlite:1, 2,3,4,5,6,8,9( 9.1,9.2,9.3),10,11,12,13,14,15,16,17,18,19,20,21,22,23,25,26
        List<String>lista2=createList("0", "#", "0", "0", "0", "#", "0", "#", "#");
        List<String> rezulatntna = createList("1", "#", "2", "0", "3", "#", "1", "#", "#");
        assertEquals(rezulatntna, SILab2.function(lista2));
    }
    //baranje 5
    @Test
    void TestEveryBranch() {
        // list.size < 0  vo jazli:1,2,3, 26
        List<String> emptyList = createEmptyList();
        RuntimeException isklucok;
        isklucok = assertThrows(RuntimeException.class, () -> SILab2.function(emptyList));
        assertTrue(isklucok.getMessage().contains("List length should be greater than 0"));
        //Gi pominuva jazlite:1,2,4,5,6,7,26
        List<String>lista=createList("0","#","0");
        isklucok = assertThrows(RuntimeException.class, () -> SILab2.function(lista));
        assertTrue(isklucok.getMessage().contains("List length should be a perfect square"));
        // gi pominuva 1, 2 ,4 ,5 ,6, 8, 9.1, 9.2, 9.3, 10, 22, 23, 24, 25, 26
        List<String>lista2=createList( "#","#", "#", "#");
        List<String> rezulatntna = createList("#","#", "#", "#");
        assertEquals(rezulatntna, SILab2.function(lista2));
        //gi pominuva 1, 2, 3 ,4 ,5 ,6, 8, 9.1, 9.2, 9.3, 10, 11,12,19,21,24,25,26
        lista2=createList( "0","0", "0", "0");
        rezulatntna = createList("0","0", "0", "0");
        assertEquals(rezulatntna, SILab2.function(lista2));
        //Gi pominuva jazlite:1, 2,3,4,5,6,8,9( 9.1,9.2,9.3),10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26
        lista2=createList("0", "#", "0", "0", "0", "#", "0", "#", "#");
        rezulatntna = createList("1", "#", "2", "0", "3", "#", "1", "#", "#");
        assertEquals(rezulatntna, SILab2.function(lista2));
    }
    }