import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DijkstraMain {


    public static void main(String[] args) {

// creates all nodes that will be used in the map

        // nodes for entrances
        Node node1 = new Node("Entrance 1");
        Node node2 = new Node("Entrance 2");
        Node node3 = new Node("Entrance 3");
        Node node4 = new Node("Entrance 4");
        Node node5 = new Node("Entrance 5");

        // node for hall 100
        Node node6 = new Node("Hall 100");

        // nodes for hall 800 and its connectors
        Node node7 = new Node("Hall 800x900");
        Node node8 = new Node("Hall 800 North");
        Node node9 = new Node("Hall 500x800");
        Node node10 = new Node("Hall 800 South");
        Node node11 = new Node("Hall 100x800");

        // nodes for hall 900 and its connectors(established connectors look above)
        Node node12 = new Node("Hall 900 East");
        Node node13 = new Node("Hall 650x900");
        Node node14 = new Node("Hall 600x900");
        Node node15 = new Node("Hall 900 Central");
        Node node16 = new Node("Hall 400x900");
        Node node17 = new Node("Hall 900 West");

        // nodes for hall 500 and its connectors(established connectors look above)
        Node node18 = new Node("Hall 500x650");
        Node node19 = new Node("Hall 500x600");
        Node node20 = new Node("Hall 500 West");
        Node node21 = new Node("Hall 400x500");

        // node for hall 650(established connectors look above)
        Node node22 = new Node("Hall 650");

        // nodes for hall 600 and its connectors(established connectors look above)
        Node node23 = new Node("Hall 600 North");
        Node node154 = new Node("Hall 600x700");
        Node node24 = new Node("Hall 600 Central");
        Node node25 = new Node("Hall 600 South");
        Node node26 = new Node("Hall 300x600");

        // nodes for hall 300 and its connectors(established connectors look above)
        Node node27 = new Node("Hall 300 East");
        Node node28 = new Node("Hall 300x400");
        Node node29 = new Node("Hall 250x300");
        Node node30 = new Node("Hall 300 West");

        // nodes for hall 250 and its connectors(established connectors look above)
        Node node31 = new Node("Hall 250");
        Node node32 = new Node("Hall 250x700");

        // nodes for hall 700 and its connectors(established connectors look above)
        Node node33 = new Node("Hall 700 East");
        Node node34 = new Node("Hall 400x700");
        Node node35 = new Node("Hall 700 West");

        // nodes for hall 400 and its connectors(established connectors look above)
        Node node36 = new Node("Hall 400 North");
        Node node155 = new Node("Hall 400 North Central");
        Node node37 = new Node("Hall 400 Central");
        Node node68 = new Node("Hall 400 South");

        // nodes for rooms

        // 100 rooms
        Node node38 = new Node("Room 102");
        Node node39 = new Node("Room 104");
        Node node40 = new Node("Room 106");

        // 250 rooms
        Node node41 = new Node("Room 250");
        Node node42 = new Node("Room 251");
        Node node43 = new Node("Room 253");
        Node node44 = new Node("Room 254");
        Node node45 = new Node("Room 255");
        Node node46 = new Node("Room 257");
        Node node47 = new Node("Room 259");
        Node node48 = new Node("Room 260");
        Node node49 = new Node("Room 262");
        Node node50 = new Node("Room 264");
        Node node51 = new Node("Room 265");

        // 300 rooms
        Node node52 = new Node("Room 302");
        Node node53 = new Node("Room 304");
        Node node54 = new Node("Room 306");
        Node node55 = new Node("Room 307");
        Node node56 = new Node("Room 309");
        Node node57 = new Node("Room 315");
        Node node58 = new Node("Room 316");
        Node node59 = new Node("Room 318");
        Node node60 = new Node("Room 319");
        Node node61 = new Node("Room 321");
        Node node62 = new Node("Room 320");
        Node node63 = new Node("Room 323");

        // 400 rooms
        Node node64 = new Node("Room 405");
        Node node65 = new Node("Room 407");
        Node node66 = new Node("Room 409");
        Node node67 = new Node("Room 411");
        Node node69 = new Node("Room 413");
        Node node70 = new Node("Room 415");
        Node node71 = new Node("Room 416");
        Node node72 = new Node("Room 418");

        // 500 rooms
        Node node73 = new Node("Room 515");
        Node node74 = new Node("Room 516");
        Node node75 = new Node("Room 517");
        Node node76 = new Node("Room 518");
        Node node77 = new Node("Room 519");
        Node node78 = new Node("Room 520");
        Node node79 = new Node("Room 521");
        Node node80 = new Node("Room 523");
        Node node81 = new Node("Room 527");
        Node node82 = new Node("Room 529");

        // 600 rooms
        Node node83 = new Node("Room 601");
        Node node84 = new Node("Room 604");
        Node node85 = new Node("Room 605");
        Node node86 = new Node("Room 606");
        Node node87 = new Node("Room 607");
        Node node88 = new Node("Room 608");
        Node node89 = new Node("Room 610");
        Node node90 = new Node("Room 611");
        Node node91 = new Node("Room 612");
        Node node92 = new Node("Room 613");

        // 650 rooms
        Node node93 = new Node("Room 651");
        Node node94 = new Node("Room 652");
        Node node95 = new Node("Room 653");
        Node node96 = new Node("Room 654");
        Node node97 = new Node("Room 655");
        Node node98 = new Node("Room 656");
        Node node99 = new Node("Room 657");
        Node node100 = new Node("Room 658");
        Node node101 = new Node("Room 659");

        // 700 rooms
        Node node102 = new Node("Room 701");
        Node node103 = new Node("Room 703");
        Node node104 = new Node("Room 705");
        Node node105 = new Node("Room 707");
        Node node106 = new Node("Room 708");
        Node node107 = new Node("Room 715");
        Node node108 = new Node("Room 716");
        Node node109 = new Node("Room 717");
        Node node110 = new Node("Room 718");
        Node node111 = new Node("Room 719");
        Node node112 = new Node("Room 722");
        Node node113 = new Node("Room 723");

        // 800 rooms
        Node node114 = new Node("Room 802");
        Node node115 = new Node("Room 804");
        Node node116 = new Node("Room 806");
        Node node117 = new Node("Room 808");
        Node node118 = new Node("Room 810");
        Node node119 = new Node("Room 812");
        Node node120 = new Node("Room 811");
        Node node121 = new Node("Room 813");
        Node node122 = new Node("Room 814");
        Node node123 = new Node("Room 815");
        Node node124 = new Node("Room 816");
        Node node125 = new Node("Room 818");
        Node node126 = new Node("Room 820");
        Node node127 = new Node("Room 822");
        Node node128 = new Node("Room 823");
        Node node129 = new Node("Room 824");
        Node node130 = new Node("Room 825");
        Node node131 = new Node("Room 826");
        Node node132 = new Node("Room 828");

        // 900 rooms
        Node node133 = new Node("Room 902");
        Node node134 = new Node("Room 903");
        Node node135 = new Node("Room 904");
        Node node136 = new Node("Room 905");
        Node node137 = new Node("Room 906");
        Node node138 = new Node("Room 907");
        Node node139 = new Node("Room 908");
        Node node140 = new Node("Room 909");
        Node node141 = new Node("Room 910");
        Node node142 = new Node("Room 911");
        Node node143 = new Node("Room 913");
        Node node144 = new Node("Room 916");
        Node node145 = new Node("Room 919");
        Node node146 = new Node("Room 920");
        Node node147 = new Node("Room 922");
        Node node148 = new Node("Room 924");
        Node node149 = new Node("Room 927");
        Node node150 = new Node("Room 929");
        Node node151 = new Node("Room 931");
        Node node152 = new Node("Room 933");
        Node node153 = new Node("Room 935");

// creates list of all nodes to use when taking an input
        List<Node> directory = Arrays.asList(node1, node2, node3, node4, node5, node6, node7, node8, node9, node10, node11, node12, node13, node14, node15, node16, node17, node18, node19, node20, node21, node22, node23, node24, node25, node26, node27, node28, node29, node30, node31, node32, node33, node34, node35, node36, node37, node38, node39, node40, node41, node42, node43, node44, node45, node46, node47, node48, node49, node50, node51, node52, node53, node54, node55, node56, node57, node58, node59, node60, node61, node62, node63, node64, node65, node66, node67, node68, node69, node70, node71, node72, node73, node74, node75, node76, node77, node78, node79, node80, node81, node82, node83, node84, node85, node86, node87, node88, node89, node90, node91, node92, node93, node94, node95, node96, node97, node98, node99, node100, node101, node102, node103, node104, node105, node106, node107, node108, node109, node110, node111, node112, node113, node114, node115, node116, node117, node118, node119, node120, node121, node122, node123, node124, node125, node126, node127, node128, node129, node130, node131, node132, node133, node134, node135, node136, node137, node138, node139, node140, node141, node142, node143, node144, node145, node146, node147, node148, node149, node150, node151, node152, node153, node154, node155);

// creates connections between the nodes so that you can go between them
        // entrance paths
        node1.addNeighbour(new Hall(5, node1, node11));
        node2.addNeighbour(new Hall(5, node2, node9));
        node3.addNeighbour(new Hall(5, node3, node7));
        node4.addNeighbour(new Hall(5, node4, node14));
        node5.addNeighbour((new Hall(5, node5, node36)));

        // path of hall 100 to 100x800
        node11.addNeighbour(new Hall(5, node11, node6));
        node6.addNeighbour(new Hall(5, node6, node11));
        // path of hall 100 to room 102
        node6.addNeighbour(new Hall(2, node6, node38));
        node38.addNeighbour(new Hall(2, node38, node6));
        // path of hall 100 to room 104
        node6.addNeighbour(new Hall(2, node6, node39));
        node39.addNeighbour(new Hall(2, node39, node6));
        // path of hall100 to room 106
        node6.addNeighbour(new Hall(2, node6, node40));
        node40.addNeighbour(new Hall(2, node40, node6));

        // path of hall250x700 to hall 250
        node32.addNeighbour(new Hall(5, node32, node31));
        node31.addNeighbour(new Hall(5, node31, node32));
        // path of hall 250 to hall 250x300
        node31.addNeighbour(new Hall(5, node31, node29));
        node29.addNeighbour(new Hall(5, node29, node31));
        // room 250
        node31.addNeighbour(new Hall(2, node31, node41));
        node41.addNeighbour(new Hall(2, node41, node31));
        // room 251
        node31.addNeighbour(new Hall(2, node31, node42));
        node42.addNeighbour(new Hall(2, node42, node31));
        // room 253
        node31.addNeighbour(new Hall(2, node31, node43));
        node43.addNeighbour(new Hall(2, node43, node31));
        // room 254
        node31.addNeighbour(new Hall(2, node31, node44));
        node44.addNeighbour(new Hall(2, node44, node31));
        // room 255
        node31.addNeighbour(new Hall(2, node31, node45));
        node45.addNeighbour(new Hall(2, node45, node31));
        // room 257
        node31.addNeighbour(new Hall(2, node31, node46));
        node46.addNeighbour(new Hall(2, node46, node31));
        // room 259
        node31.addNeighbour(new Hall(2, node31, node47));
        node47.addNeighbour(new Hall(2, node47, node31));
        // room 260
        node31.addNeighbour(new Hall(2, node31, node48));
        node48.addNeighbour(new Hall(2, node48, node31));
        // room 262
        node31.addNeighbour(new Hall(2, node31, node49));
        node49.addNeighbour(new Hall(2, node49, node31));
        // room 264
        node31.addNeighbour(new Hall(2, node31, node50));
        node50.addNeighbour(new Hall(2, node50, node31));
        // room 265
        node31.addNeighbour(new Hall(2, node31, node51));
        node51.addNeighbour(new Hall(2, node51, node31));

        // hall 100x800 to 800S
        node11.addNeighbour(new Hall(5, node11, node10));
        node10.addNeighbour(new Hall(5, node10, node11));
        // hall 800S to 500x800
        node10.addNeighbour(new Hall(5, node10, node9));
        node9.addNeighbour(new Hall(5, node9, node10));
        // hall 500x800 to 800N
        node9.addNeighbour(new Hall(5, node9, node8));
        node8.addNeighbour(new Hall(5, node8, node9));
        // hall 800N to 800x900
        node8.addNeighbour(new Hall(5, node8, node7));
        node7.addNeighbour(new Hall(5, node7, node8));
        // room 802
        node11.addNeighbour(new Hall(2, node11, node114));
        node114.addNeighbour(new Hall(2, node114, node11));
        // room 804
        node11.addNeighbour(new Hall(2, node11, node115));
        node115.addNeighbour(new Hall(2, node115, node11));
        // room 806
        node10.addNeighbour(new Hall(2, node10, node116));
        node116.addNeighbour(new Hall(2, node116, node10));
        // room 808
        node10.addNeighbour(new Hall(2, node10, node117));
        node117.addNeighbour(new Hall(2, node117, node10));
        // room 810
        node10.addNeighbour(new Hall(2, node10, node118));
        node118.addNeighbour(new Hall(2, node118, node10));
        // room 811
        node10.addNeighbour(new Hall(2, node10, node120));
        node120.addNeighbour(new Hall(2, node120, node10));
        // room 812
        node10.addNeighbour(new Hall(2, node10, node119));
        node119.addNeighbour(new Hall(2, node119, node10));
        // room 813
        node10.addNeighbour(new Hall(2, node10, node121));
        node121.addNeighbour(new Hall(2, node121, node10));
        // room 814
        node10.addNeighbour(new Hall(2, node10, node122));
        node122.addNeighbour(new Hall(2, node122, node10));
        // room 815
        node8.addNeighbour(new Hall(2, node8, node123));
        node123.addNeighbour(new Hall(2, node123, node8));
        // room 816
        node8.addNeighbour(new Hall(2, node8, node124));
        node124.addNeighbour(new Hall(2, node124, node8));
        // room 818
        node8.addNeighbour(new Hall(2, node8, node125));
        node125.addNeighbour(new Hall(2, node125, node8));
        // room 820
        node8.addNeighbour(new Hall(2, node8, node126));
        node126.addNeighbour(new Hall(2, node126, node8));
        // room 822
        node8.addNeighbour(new Hall(2, node8, node127));
        node127.addNeighbour(new Hall(2, node127, node8));
        // room 823
        node8.addNeighbour(new Hall(2, node8, node128));
        node128.addNeighbour(new Hall(2, node128, node8));
        // room 824
        node8.addNeighbour(new Hall(2, node8, node129));
        node129.addNeighbour(new Hall(2, node129, node8));
        // room 825
        node8.addNeighbour(new Hall(2, node8, node130));
        node130.addNeighbour(new Hall(2, node130, node8));
        // room 826
        node7.addNeighbour(new Hall(2, node7, node131));
        node131.addNeighbour(new Hall(2, node131, node7));
        // room 828
        node7.addNeighbour(new Hall(2, node7, node132));
        node132.addNeighbour(new Hall(2, node132, node7));

        // hall 500x650 to 650
        node18.addNeighbour(new Hall(5, node18, node22));
        node22.addNeighbour(new Hall(5, node22, node18));
        // hall 650 to 650x900
        node22.addNeighbour(new Hall(5, node22, node13));
        node13.addNeighbour(new Hall(5, node13, node22));
        // room 527
        node18.addNeighbour(new Hall(2, node18, node81));
        node81.addNeighbour(new Hall(2, node81, node18));
        // room 529
        node18.addNeighbour(new Hall(2, node18, node82));
        node82.addNeighbour(new Hall(2, node82, node18));
        // room 651
        node22.addNeighbour(new Hall(2, node22, node93));
        node93.addNeighbour(new Hall(2, node93, node22));
        // room 652
        node22.addNeighbour(new Hall(2, node22, node94));
        node94.addNeighbour(new Hall(2, node94, node22));
        // room 653
        node22.addNeighbour(new Hall(2, node22, node95));
        node95.addNeighbour(new Hall(2, node95, node22));
        // room 654
        node22.addNeighbour(new Hall(2, node22, node96));
        node96.addNeighbour(new Hall(2, node96, node22));
        // room 655
        node22.addNeighbour(new Hall(2, node22, node97));
        node97.addNeighbour(new Hall(2, node97, node22));
        // room 656
        node22.addNeighbour(new Hall(2, node22, node98));
        node98.addNeighbour(new Hall(2, node98, node22));
        // room 657
        node22.addNeighbour(new Hall(2, node22, node99));
        node99.addNeighbour(new Hall(2, node99, node22));
        // room 658
        node22.addNeighbour(new Hall(2, node22, node100));
        node100.addNeighbour(new Hall(2, node100, node22));
        // room 659
        node22.addNeighbour(new Hall(2, node22, node101));
        node101.addNeighbour(new Hall(2, node101, node22));

        // hall 300x600 to 600S
        node26.addNeighbour(new Hall(5, node26, node25));
        node25.addNeighbour(new Hall(5, node25, node26));
        // hall 600S to 500x600
        node25.addNeighbour(new Hall(5, node25, node19));
        node19.addNeighbour(new Hall(5, node19, node25));
        // hall 500x600 to 600C
        node19.addNeighbour(new Hall(5, node19, node24));
        node24.addNeighbour(new Hall(5, node24, node19));
        // hall 600C to 600x700
        node24.addNeighbour(new Hall(5, node24, node154));
        node154.addNeighbour(new Hall(5, node154, node24));
        // hall 600x700 to 600N
        node154.addNeighbour(new Hall(5, node154, node23));
        node23.addNeighbour(new Hall(5, node23, node154));
        // hall 600N to 600x900
        node23.addNeighbour(new Hall(5, node23, node14));
        node14.addNeighbour(new Hall(5, node14, node23));
        // room 601
        node26.addNeighbour(new Hall(2, node26, node83));
        node83.addNeighbour(new Hall(2, node83, node26));
        // room 604
        node25.addNeighbour(new Hall(5, node25, node84));
        node84.addNeighbour(new Hall(5, node84, node25));
        // room 605
        node25.addNeighbour(new Hall(2, node25, node85));
        node85.addNeighbour(new Hall(2, node85, node25));
        // room 606
        node24.addNeighbour(new Hall(2, node24, node86));
        node86.addNeighbour(new Hall(2, node86, node24));
        // room 607
        node24.addNeighbour(new Hall(5, node24, node87));
        node87.addNeighbour(new Hall(5, node87, node24));
        // room 608
        node154.addNeighbour(new Hall(2, node154, node88));
        node88.addNeighbour(new Hall(2, node88, node154));
        // room 610
        node23.addNeighbour(new Hall(2, node23, node89));
        node89.addNeighbour(new Hall(2, node89, node23));
        // room 611
        node23.addNeighbour(new Hall(2, node23, node90));
        node90.addNeighbour(new Hall(2, node90, node23));
        // room 612
        node23.addNeighbour(new Hall(2, node23, node91));
        node91.addNeighbour(new Hall(2, node91, node23));
        // room 613
        node15.addNeighbour(new Hall(2, node15, node92));
        node92.addNeighbour(new Hall(2, node92, node15));

        // hall 300x400 to 400S
        node28.addNeighbour(new Hall(5, node28, node68));
        node68.addNeighbour(new Hall(5, node68, node28));
        // hall 400S to 400x500
        node68.addNeighbour(new Hall(5, node68, node21));
        node21.addNeighbour(new Hall(5, node21, node68));
        // hall 400x500 to 400C
        node21.addNeighbour(new Hall(5, node21, node37));
        node37.addNeighbour(new Hall(5, node37, node21));
        // hall 400C to 400x700
        node37.addNeighbour(new Hall(5, node37, node34));
        node34.addNeighbour(new Hall(5, node34, node37));
        // hall 400x700 to 400NC
        node34.addNeighbour(new Hall(5, node34, node155));
        node155.addNeighbour(new Hall(5, node155, node34));
        // hall 400NC to 400x900
        node155.addNeighbour(new Hall(5, node155, node16));
        node16.addNeighbour(new Hall(5, node16, node155));
        // hall 400x900 to 400N
        node16.addNeighbour(new Hall(5, node16, node36));
        node36.addNeighbour(new Hall(5, node36, node16));
        // room 405
        node28.addNeighbour(new Hall(2, node28, node64));
        node64.addNeighbour(new Hall(2, node64, node28));
        // room 307
        node28.addNeighbour(new Hall(2, node28, node55));
        node55.addNeighbour(new Hall(2, node55, node28));
        // room 309
        node28.addNeighbour(new Hall(2, node28, node56));
        node56.addNeighbour(new Hall(2, node56, node28));
        // room 315
        node28.addNeighbour(new Hall(5, node28, node57));
        node57.addNeighbour(new Hall(5, node57, node28));
        //room 316
        node28.addNeighbour(new Hall(5, node28, node58));
        node58.addNeighbour(new Hall(5, node58, node28));
        // room 407
        node68.addNeighbour(new Hall(2, node68, node65));
        node65.addNeighbour(new Hall(2, node65, node68));
        // room 409
        node68.addNeighbour(new Hall(2, node68, node66));
        node66.addNeighbour(new Hall(2, node66 ,node68));
        // room 516
        node68.addNeighbour(new Hall(5, node68, node74));
        node74.addNeighbour(new Hall(5, node74, node68));
        // room 411
        node37.addNeighbour(new Hall(2, node37, node67));
        node67.addNeighbour(new Hall(2, node67, node37));
        // room 413
        node37.addNeighbour(new Hall(2, node37, node69));
        node69.addNeighbour(new Hall(2, node69, node37));
        // room 515
        node37.addNeighbour(new Hall(5, node37, node73));
        node73.addNeighbour(new Hall(5, node73, node37));
        // room 716
        node37.addNeighbour(new Hall(5, node37, node108));
        node108.addNeighbour(new Hall(5, node108, node37));
        // room 708
        node34.addNeighbour(new Hall(2, node34, node106));
        node106.addNeighbour(new Hall(2, node106, node34));
        // room 715
        node34.addNeighbour(new Hall(5, node34, node107));
        node107.addNeighbour(new Hall(5, node107, node34));
        // room 707
        node34.addNeighbour(new Hall(5, node34, node105));
        node105.addNeighbour(new Hall(5, node105, node34));
        //room 715
        node155.addNeighbour(new Hall(5, node155, node107));
        node107.addNeighbour(new Hall(5, node107, node155));
        // room 415
        node36.addNeighbour(new Hall(2, node36, node70));
        node70.addNeighbour(new Hall(2, node70, node36));
        // room 416
        node36.addNeighbour(new Hall(2, node36, node71));
        node71.addNeighbour(new Hall(2, node71, node36));
        // room 418
        node36.addNeighbour(new Hall(2, node36, node72));
        node72.addNeighbour(new Hall(2, node72, node36));

        // hall 300W to 250x300
        node30.addNeighbour(new Hall(5, node30, node29));
        node29.addNeighbour(new Hall(5, node29, node30));
        // hall 250x300 to 300x400
        node29.addNeighbour(new Hall(5, node29, node28));
        node28.addNeighbour(new Hall(5, node28, node29));
        // hall 300x400 to 300E
        node28.addNeighbour(new Hall(5, node28, node27));
        node27.addNeighbour(new Hall(5, node27, node28));
        // hall 300E to 300x600
        node27.addNeighbour(new Hall(5, node27, node26));
        node26.addNeighbour(new Hall(5, node26, node27));
        // room 302
        node30.addNeighbour(new Hall(2, node30, node52));
        node52.addNeighbour(new Hall(2, node52, node30));
        // room 304
        node29.addNeighbour(new Hall(2, node29, node53));
        node53.addNeighbour(new Hall(2, node53, node29));
        // room 306
        node29.addNeighbour(new Hall(2, node29, node54));
        node54.addNeighbour(new Hall(2, node54, node29));
        // room 315
        node27.addNeighbour(new Hall(5, node27, node57));
        node57.addNeighbour(new Hall(5, node57, node27));
        // room 316
        node27.addNeighbour(new Hall(5, node27, node58));
        node58.addNeighbour(new Hall(5, node58, node27));
        // room 318
        node27.addNeighbour(new Hall(2, node27, node59));
        node59.addNeighbour(new Hall(2, node59, node27));
        // room 319
        node27.addNeighbour(new Hall(2, node27, node60));
        node60.addNeighbour(new Hall(2, node60, node27));
        // room 321
        node27.addNeighbour(new Hall(2, node27, node61));
        node61.addNeighbour(new Hall(2, node61, node27));
        // room 320
        node27.addNeighbour(new Hall(2, node27, node62));
        node62.addNeighbour(new Hall(2, node62, node27));
        // room 323
        node27.addNeighbour(new Hall(2, node27, node63));
        node63.addNeighbour(new Hall(2, node63, node27));

        // hall 400x500 to 500W
        node21.addNeighbour(new Hall(5, node21, node20));
        node20.addNeighbour(new Hall(5, node21, node21));
        // hall 500W to  500x600
        node20.addNeighbour(new Hall(5, node20, node19));
        node19.addNeighbour(new Hall(5, node19, node20));
        // hall 500x600 to 500x650
        node19.addNeighbour(new Hall(5, node19, node18));
        node18.addNeighbour(new Hall(5, node18, node19));
        // hall 500x650 to 500x800
        node18.addNeighbour(new Hall(5, node18, node9));
        node9.addNeighbour(new Hall(5, node9, node18));
        // room 515
        node20.addNeighbour(new Hall(5, node20, node73));
        node73.addNeighbour(new Hall(5, node73, node20));
        // room 516
        node20.addNeighbour(new Hall(5, node20, node74));
        node74.addNeighbour(new Hall(5, node74, node20));
        // room 517
        node20.addNeighbour(new Hall(2, node20, node75));
        node75.addNeighbour(new Hall(2, node75, node20));
        // room 518
        node20.addNeighbour(new Hall(2, node20, node76));
        node76.addNeighbour(new Hall(2, node76, node20));
        // room 519
        node20.addNeighbour(new Hall(2, node20, node77));
        node77.addNeighbour(new Hall(2, node77, node20));
        // room 520
        node20.addNeighbour(new Hall(2, node20, node78));
        node78.addNeighbour(new Hall(2, node78, node20));
        // room 521
        node20.addNeighbour(new Hall(2, node20, node79));
        node79.addNeighbour(new Hall(2, node79, node20));
        // room 523
        node20.addNeighbour(new Hall(2, node20, node80));
        node80.addNeighbour(new Hall(2, node80, node20));

        // hall 700W to 250x700
        node35.addNeighbour(new Hall(5, node35, node32));
        node32.addNeighbour(new Hall(5, node32, node35));
        // hall 250x700 to 400x700
        node32.addNeighbour(new Hall(5, node32, node34));
        node34.addNeighbour(new Hall(5, node34, node32));
        // hall 400x700 to 700E
        node34.addNeighbour(new Hall(5, node34, node33));
        node33.addNeighbour(new Hall(5, node33, node34));
        // hall 700E to 600x700
        node33.addNeighbour(new Hall(5, node33, node154));
        node154.addNeighbour(new Hall(5, node154, node33));
        // room 701
        node35.addNeighbour(new Hall(2, node35, node102));
        node102.addNeighbour(new Hall(2, node102, node35));
        // room 703
        node35.addNeighbour(new Hall(2, node35, node103));
        node103.addNeighbour(new Hall(2, node103, node35));
        // room 705
        node32.addNeighbour(new Hall(2, node32, node104));
        node104.addNeighbour(new Hall(2, node104, node32));
        // room 707
        node32.addNeighbour(new Hall(5, node32, node105));
        node105.addNeighbour(new Hall(5, node105, node32));
        // room 716
        node33.addNeighbour(new Hall(5, node33, node108));
        node108.addNeighbour(new Hall(5, node108, node33));
        // room 717
        node33.addNeighbour(new Hall(2, node33, node109));
        node109.addNeighbour(new Hall(2, node109, node33));
        // room 718
        node33.addNeighbour(new Hall(2, node33, node110));
        node110.addNeighbour(new Hall(2, node110, node33));
        // room 719
        node33.addNeighbour(new Hall(2, node33, node111));
        node111.addNeighbour(new Hall(2, node111, node33));
        // room 722
        node33.addNeighbour(new Hall(2, node33, node112));
        node112.addNeighbour(new Hall(2, node112, node33));
        // room 723
        node33.addNeighbour(new Hall(2, node33, node113));
        node113.addNeighbour(new Hall(2, node113, node33));
        // room 607
        node33.addNeighbour(new Hall(5, node33, node87));
        node87.addNeighbour(new Hall(5, node87, node33));

        // hall 900W to 400x900
        node17.addNeighbour(new Hall(5, node17, node16));
        node16.addNeighbour(new Hall(5, node16, node17));
        // hall 400x900 to 900C
        node16.addNeighbour(new Hall(5, node16, node15));
        node15.addNeighbour(new Hall(5, node15, node16));
        // hall 900C to 600x900
        node15.addNeighbour(new Hall(5, node15, node14));
        node14.addNeighbour(new Hall(5, node14, node15));
        // hall 600x900 to 650x900
        node14.addNeighbour(new Hall(5, node14, node13));
        node13.addNeighbour(new Hall(5, node13, node14));
        // hall 650x900 to 900E
        node13.addNeighbour(new Hall(5, node13, node12));
        node12.addNeighbour(new Hall(5, node12, node13));
        // hall 900E to 800x900
        node12.addNeighbour(new Hall(5, node12, node7));
        node7.addNeighbour(new Hall(5, node7, node12));
        // room 902
        node17.addNeighbour(new Hall(2, node17, node133));
        node133.addNeighbour(new Hall(2, node133, node17));
        // room 903
        node17.addNeighbour(new Hall(2, node17, node134));
        node134.addNeighbour(new Hall(2, node134, node17));
        // room 904
        node17.addNeighbour(new Hall(2, node17, node135));
        node135.addNeighbour(new Hall(2, node135, node17));
        // room 905
        node17.addNeighbour(new Hall(2, node17, node136));
        node136.addNeighbour(new Hall(2, node136, node17));
        // room 906
        node17.addNeighbour(new Hall(2, node17, node137));
        node137.addNeighbour(new Hall(2, node137, node17));
        // room 907
        node17.addNeighbour(new Hall(2, node17, node138));
        node138.addNeighbour(new Hall(2, node138, node17));
        // room 908
        node17.addNeighbour(new Hall(2, node17, node139));
        node139.addNeighbour(new Hall(2, node139, node17));
        // room 909
        node17.addNeighbour(new Hall(2, node17, node140));
        node140.addNeighbour(new Hall(2, node140, node17));
        // room 910
        node17.addNeighbour(new Hall(2, node17, node141));
        node141.addNeighbour(new Hall(2, node141, node17));
        // room 911
        node17.addNeighbour(new Hall(2, node17, node142));
        node142.addNeighbour(new Hall(2, node142, node17));
        // room 913
        node17.addNeighbour(new Hall(2, node17, node143));
        node143.addNeighbour(new Hall(2, node143, node17));
        // room 916
        node15.addNeighbour(new Hall(2, node15, node144));
        node144.addNeighbour(new Hall(2, node144, node15));
        // room 919
        node15.addNeighbour(new Hall(2, node15, node145));
        node145.addNeighbour(new Hall(2, node145, node15));
        // room 920
        node15.addNeighbour(new Hall(2, node15, node146));
        node146.addNeighbour(new Hall(2, node146, node15));
        // room 922
        node15.addNeighbour(new Hall(2, node15, node147));
        node147.addNeighbour(new Hall(2, node147, node15));
        // room 924
        node15.addNeighbour(new Hall(2, node15, node148));
        node148.addNeighbour(new Hall(2, node148, node15));
        // room 927
        node14.addNeighbour(new Hall(5, node14, node149));
        node149.addNeighbour(new Hall(5, node149, node14));
        // room 929
        node13.addNeighbour(new Hall(5, node13, node150));
        node150.addNeighbour(new Hall(5, node150, node13));
        // room 931
        node13.addNeighbour(new Hall(2, node13, node151));
        node151.addNeighbour(new Hall(2, node151, node13));
        // room 933
        node12.addNeighbour(new Hall(2, node12, node152));
        node152.addNeighbour(new Hall(2, node152, node12));
        // room 935
        node12.addNeighbour(new Hall(2, node12, node153));
        node153.addNeighbour(new Hall(2, node153, node12));

// creates object of DijkstraShortestPath class
        DijkstraShortestPath shortestPath = new DijkstraShortestPath();

// input for start and end
        Scanner scan = new Scanner(System.in);

        System.out.println("Where are you starting: ");
        String start = scan.nextLine();

        System.out.println("Where are you going: ");
        String end = scan.nextLine();

// for loop to find the start based on the input in the directory of all nodes
        Node startNode = null;
        for (Node s: directory) {
            if (s.getName().equals(start)) {
                startNode = s;
            }
        }

// for loop to find the destination based on the input in the directory of all nodes
        Node endNode = null;
        for (Node s: directory) {
            if (s.getName().equals(end)) {
                endNode = s;
            }
        }

// calls the function from the dijkstraShortestPath class to get the shortest distances to every node from the starting node
        shortestPath.computeShortestPaths(startNode);

// for loop to display the directions to get to the destination from the start point
        System.out.print("To get there,");
        for (int i = 0; i < shortestPath.getShortestPathTo(endNode).size(); i++) {
            if (i == 0) {
                System.out.print(" go to ");
            } else {
                System.out.print(" then go to ");
            }
            System.out.println(shortestPath.getShortestPathTo(endNode).get(i));
        }

        System.out.println("\n");
        System.out.println("=================================================================");

// input to check if arrived
        System.out.println("Arrived? Or where are you: ");
        start = scan.nextLine();

// terminal while loop if they haven't arrived
        while (!start.equals("Arrived")) {

// sets the start node as the new input
            for (Node s: directory) {
                if (s.getName().equals(start)) {
                    startNode = s;
                }
            }

// resets the fields of distance visited and predecessor of each node so that it can recalculate the paths
            for (Node s: directory) {
                s.setDistance(Integer.MAX_VALUE);
                s.setVisited(false);
                s.setPredecessor(null);
            }

// calls the calculation method
            shortestPath.computeShortestPaths(startNode);

// for loop with an if-else statement in it to display the directions
            System.out.print("To get there,");
            for (int i = 0; i < shortestPath.getShortestPathTo(endNode).size(); i++) {
                if (i == 0) {
                    System.out.print(" go to ");
                } else {
                    System.out.print(" then go to ");
                }
                System.out.println(shortestPath.getShortestPathTo(endNode).get(i));
            }

            System.out.println("\n");

// retakes input on location or arrived
            System.out.println("=================================================================");
            System.out.println("Arrived? Or where are you: ");
            start = scan.nextLine();
        }
    }
}
