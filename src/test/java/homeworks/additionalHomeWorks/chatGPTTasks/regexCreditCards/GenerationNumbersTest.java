package homeworks.additionalHomeWorks.chatGPTTasks.regexCreditCards;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
class GenerationNumbersTest {
    GenerationNumbers gt;



    @Test
    void generateCardDataGeneral() {
        String expected = "13839689710973640433702";
        gt = mock(GenerationNumbers.class);
        when(gt.generateCardData(28)).thenReturn(expected);
        String actual = gt.generateCardData(28);
        assertEquals(expected, actual);
    }

    @Test
    void extractingDataFormatting(){
        FindCardData fcd = new FindCardData();
        String expected = "CARD NUMBER: 7859 9252 5151 9538\n" +
                "EXP DATE: 07/33\n" +
                "CVV: 115\n";
        String actual = fcd.extractingData("78599252515195380733115");
        assertEquals(expected, actual);
    }

    @Test
    void checkIfCardSave(){
        SavingCard sc = new SavingCard();
        Set<String> expectedCardsNumbers = new HashSet<>();
        Set<String> expectedCardsAllData = new HashSet<>();

        expectedCardsNumbers.add("7859925251519538");
        expectedCardsAllData.add("78599252515195380733115");

        sc.saveCard("78599252515195380733115");

        assertEquals(expectedCardsNumbers, sc.getCardsNumbers());
        assertEquals(expectedCardsAllData, sc.getCardsAllData());
    }

    @Test
    void checkIfCardSaveMock(){
        SavingCard sc = new SavingCard();
        Set<String> expectedCardsNumbers = new HashSet<>();
        Set<String> expectedCardsAllData = new HashSet<>();
        expectedCardsAllData.add("78599252515195380733115");
        expectedCardsNumbers.add("7859925251519538");

        sc.saveCard("78599252515195380733115");

        assertEquals(expectedCardsNumbers,sc.getCardsNumbers());
        assertEquals(expectedCardsAllData, sc.getCardsAllData());
    }
}