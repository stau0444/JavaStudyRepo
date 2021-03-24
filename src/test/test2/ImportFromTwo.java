package test.test2;

//아래 두 패키지의 최상위 패키지는 java이다
import test.test1.ImportFormOne;

import java.awt.*;
import java.util.*;
//위와 같은 두개의 import 문을 아래와 같이 표현할 수는 없다.
import java.*;


public class ImportFromTwo  {
    String a = "스트링";
    ImportFormOne importFormOne = new ImportFormOne();
}
