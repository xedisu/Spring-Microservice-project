package com.smp.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@ExtendWith(MockitoExtension.class)
public class ManipulatorServiceTest {

    @InjectMocks
    ManipulatorService manipulatorService;

    @Test
    void cutsUsernameValidInput () {
        String username = "mircea";
        assertEquals("mir", manipulatorService.cutsUsername(username));
    }

    @Test
    void cutsUsernameInvalidInput () {
        String username = "";
        assertEquals("", manipulatorService.cutsUsername(username));
    }

    @Test
    void cutsUsernameNullInput () {
        String username = null;
        assertNull( manipulatorService.cutsUsername(username));
    }

    @Test
    void enlargeUsernameValidInputSmallerThanSeven () {
        String username = "ana";
        assertEquals("anaanaana",manipulatorService.enlargeUsername(username));
    }

    @Test
    void enlargeUsernameValidInputLargerThanSeven () {
        String username = "mirceabadea";
        assertEquals("mirceabadea",manipulatorService.enlargeUsername(username));
    }

    @Test
    void enlargeUsernameWithEmptyInput () {
        String username = "";
        assertEquals("",manipulatorService.enlargeUsername(username));
    }

    @Test
    void enlargeUsernameWithNullPointer () {
        String username = null;
        assertNull(manipulatorService.enlargeUsername(username));
    }

    @Test
    void alterUsernameValidInput (){
        String temp = "Nanana";

        assertEquals("aaa", manipulatorService.alterUsername(temp));
    }

    @Test
    void alterUsernameValidInputVariation (){
        String temp = "nanana";

        assertEquals("nnn", manipulatorService.alterUsername(temp));
    }

    @Test
    void alterUsernameWithNumberInput (){
        String temp = "1nanana";

        assertEquals("1aaa", manipulatorService.alterUsername(temp));
    }

    @Test
    void alterUsernameWithSpecialCharacterInput (){
        String temp = "#nanana";

        assertEquals("#aaa", manipulatorService.alterUsername(temp));
    }

    @Test
    void alterUsernameWithNullInput (){
        String temp = null;

        assertNull(manipulatorService.alterUsername(temp));
    }

    @Test
    void alterUsernameWithEmptyInput (){
        String temp = "";

        assertEquals("", manipulatorService.alterUsername(temp));
    }

    @Test
    void toUpperCaseValidInput () {
        String temp = "servetele";

        manipulatorService.toUpperCase(temp);

        assertEquals("SERVETELE", temp);
    }
}
