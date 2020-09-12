package com.seohan.common.Util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCalculator {


    private static class TIME_MAXIMUM {
        public static final int SEC = 60;
        public static final int MIN = 60;
        public static final int HOUR = 24;
        public static final int DAY = 30;
        public static final int MONTH = 12;
    }

    public static String calculateFromCurrent(Date date) {

        long curTime = System.currentTimeMillis();
        long regTime = date.getTime();
        long diffTime = (curTime - regTime) / 1000;

        String msg = null;
        if (diffTime < TIME_MAXIMUM.SEC) {
            msg = "방금 전";
        } else if ((diffTime /= TIME_MAXIMUM.SEC) < TIME_MAXIMUM.MIN) {
            msg = diffTime + "분 전";
        } else if ((diffTime /= TIME_MAXIMUM.MIN) < TIME_MAXIMUM.HOUR) {
            msg = (diffTime) + "시간 전";
        } else if ((diffTime /= TIME_MAXIMUM.HOUR) < TIME_MAXIMUM.DAY) {
            msg = (diffTime) + "일 전";
        } else if ((diffTime /= TIME_MAXIMUM.DAY) < TIME_MAXIMUM.MONTH) {
            msg = (diffTime) + "달 전";
        } else {
            msg = (diffTime) + "년 전";
        }

        return msg;
    }


    public String convertDateToLot(String convertDate) {
//	D_LOT_CVT(IN_DATE As String, IN_JO As String, IN_TIME As String) As String
//
//	Select Case
//
//	Left$(IN_DATE, 4)
//
//	Case "2002":WK_Y ="X"
//	Case "2003":WK_Y ="Y"
//	Case "2004":WK_Y ="Z"
//	Case "2005":WK_Y ="E"
//	Case "2006":WK_Y ="F"
//	Case "2007":WK_Y ="G"
//	Case "2008":WK_Y ="H"
//	Case "2009":WK_Y ="I"
//	Case "2010":WK_Y ="J"
//	Case "2011":WK_Y ="K"
//	Case "2012":WK_Y ="L"
//	Case "2013":WK_Y ="M"
//	Case "2014":WK_Y ="N"
//	Case "2015":WK_Y ="O"
//	Case "2016":WK_Y ="P"
//	Case "2017":WK_Y ="Q"
//	Case "2018":WK_Y ="R"
//	Case "2019":WK_Y ="S"
//	Case "2020":WK_Y ="T"
//	Case "2021":WK_Y ="U"
//	Case "2022":WK_Y ="V"
//	Case "2023":WK_Y ="W"
//
//
//	End Select
//
//	Select Case
//
//	Val(Mid$(IN_DATE, 5,2))
//	Case 1:WK_M ="A"
//	Case 2:WK_M ="B"
//	Case 3:WK_M ="C"
//	Case 4:WK_M ="D"
//	Case 5:WK_M ="E"
//	Case 6:WK_M ="F"
//	Case 7:WK_M ="G"
//	Case 8:WK_M ="H"
//	Case 9:WK_M ="I"
//	Case 10:WK_M ="J"
//	Case 11:WK_M ="K"
//	Case 12:WK_M ="L"
//	End Select
//
//	Select Case
//
//	Val(Mid$(IN_DATE, 7,2))
//	Case 1:WK_D ="A"
//	Case 2:WK_D ="B"
//	Case 3:WK_D ="C"
//	Case 4:WK_D ="D"
//	Case 5:WK_D ="E"
//	Case 6:WK_D ="F"
//	Case 7:WK_D ="G"
//	Case 8:WK_D ="H"
//	Case 9:WK_D ="I"
//	Case 10:WK_D ="J"
//	Case 11:WK_D ="K"
//	Case 12:WK_D ="L"
//	Case 13:WK_D ="M"
//	Case 14:WK_D ="N"
//	Case 15:WK_D ="O"
//	Case 16:WK_D ="P"
//	Case 17:WK_D ="Q"
//	Case 18:WK_D ="R"
//	Case 19:WK_D ="S"
//	Case 20:WK_D ="T"
//	Case 21:WK_D ="U"
//	Case 22:WK_D ="V"
//	Case 23:WK_D ="W"
//	Case 24:WK_D ="X"
//	Case 25:WK_D ="Y"
//	Case 26:WK_D ="Z"
//	Case 27:WK_D ="2"
//	Case 28:WK_D ="3"
//	Case 29:WK_D ="4"
//	Case 30:WK_D ="5"
//	Case 31:WK_D ="6"
//
//	End Select
//
//	Select Case
//	IN_JO
//	Case "A":WK_J ="1"
//	Case "B":WK_J ="2"
//	Case "C":WK_J ="1"
//	Case "P":WK_J ="1"
//	Case "Y":WK_J ="2"
//	Case "J":WK_J ="1"
//	Case Else:WK_J =""
//	End Select
//
//	WK_T =
//
//	Format(IN_TIME, "00")
//
//	D_LOT_CVT =WK_Y &WK_M &WK_D &WK_J &WK_T
        return "";
    }

    public String convertLotToDate(String lotString) {
//    Dim WK_Y
//    As String *4
//    Dim WK_M
//    As String *2
//    Dim WK_D
//    As String *2
//    Dim WK_J
//    As String *1
//    Dim WK_T
//    As String *2
//
//    Dim FCT
//    As String
//
//
//    Select Case
//
//    Left$(IN_LOT, 1)
//
//    Case "X":WK_Y ="2002"
//    Case "Y":WK_Y ="2003"
//    Case "Z":WK_Y ="2004"
//    Case "E":WK_Y ="2005"
//    Case "F":WK_Y ="2006"
//    Case "G":WK_Y ="2007"
//    Case "H":WK_Y ="2008"
//    Case "I":WK_Y ="2009"
//    Case "J":WK_Y ="2010"
//    Case "K":WK_Y ="2011"
//    Case "L":WK_Y ="2012"
//    Case "M":WK_Y ="2013"
//    Case "N":WK_Y ="2014"
//    Case "O":WK_Y ="2015"
//    Case "P":WK_Y ="2016"
//    Case "Q":WK_Y ="2017"
//    Case "R":WK_Y ="2018"
//    Case "S":WK_Y ="2019"
//    Case "T":WK_Y ="2020"
//    Case "U":WK_Y ="2021"
//    Case "V":WK_Y ="2022"
//    Case "W":WK_Y ="2023"
//
//    Case Else:WK_Y =""
//    End Select
//
//    Select Case
//
//    Mid$(IN_LOT, 2,1)
//
//    Case "A":WK_M ="01"
//    Case "B":WK_M ="02"
//    Case "C":WK_M ="03"
//    Case "D":WK_M ="04"
//    Case "E":WK_M ="05"
//    Case "F":WK_M ="06"
//    Case "G":WK_M ="07"
//    Case "H":WK_M ="08"
//    Case "I":WK_M ="09"
//    Case "J":WK_M ="10"
//    Case "K":WK_M ="11"
//    Case "L":WK_M ="12"
//    Case Else:WK_M =""
//    End Select
//
//    Select Case
//
//    Mid$(IN_LOT, 3,1)
//
//    Case "A":WK_D ="01"
//    Case "B":WK_D ="02"
//    Case "C":WK_D ="03"
//    Case "D":WK_D ="04"
//    Case "E":WK_D ="05"
//    Case "F":WK_D ="06"
//    Case "G":WK_D ="07"
//    Case "H":WK_D ="08"
//    Case "I":WK_D ="09"
//    Case "J":WK_D ="10"
//    Case "K":WK_D ="11"
//    Case "L":WK_D ="12"
//    Case "M":WK_D ="13"
//    Case "N":WK_D ="14"
//    Case "O":WK_D ="15"
//    Case "P":WK_D ="16"
//    Case "Q":WK_D ="17"
//    Case "R":WK_D ="18"
//    Case "S":WK_D ="19"
//    Case "T":WK_D ="20"
//    Case "U":WK_D ="21"
//    Case "V":WK_D ="22"
//    Case "W":WK_D ="23"
//    Case "X":WK_D ="24"
//    Case "Y":WK_D ="25"
//    Case "Z":WK_D ="26"
//    Case "2":WK_D ="27"
//    Case "3":WK_D ="28"
//    Case "4":WK_D ="29"
//    Case "5":WK_D ="30"
//    Case "6":WK_D ="31"
//    Case Else:WK_D =""
//
//    End Select
//
//'    If FCT = "A" And (IN_LINE <> "F41" And IN_LINE <> "F42") And WK_Y & WK_M & WK_D > "20160302" Then '''2016.3.3
//    LOT세분화 이후
//'         Select Case Mid$(IN_LOT, 4, 1)
//        '            Case "1": WK_J = "P"
//        '            Case "2": WK_J = "P"
//        '            Case "3": WK_J = "Y"
//        '            Case "4": WK_J = "Y"
//        '            Case Else: WK_J = ""
//        '         End Select
//        '   Else '''기존
//    Select Case
//
//    Mid$(IN_LOT, 4,1)
//
//    Case "1":WK_J ="P"
//    Case "2":WK_J ="Y"
//    Case Else:WK_J =""
//    End Select
//'   End If
//
//    Select Case
//
//    Val(Mid$(IN_LOT, 5,6))
//    Case 0To 99:WK_T =
//
//    Format(Mid$(IN_LOT, 5,6), "00")
//    Case Else:WK_T =""
//    End Select
//
//    If Trim(WK_Y) =""
//
//    Or Trim(WK_M) =""
//
//    Or Trim(WK_D) =""
//    Then
//            L_DAT_CVT = ""
//    Else
//            L_DAT_CVT = WK_Y & WK_M & WK_D & WK_J & WK_T
//    End If
//
//    End Function
        return "";
    }
}
