
    var pageVueRenderFn = function anonymous(
) {
with(this){return _c('div',{attrs:{"id":"app"}},[_m(0),_v(" "),_c('header',{attrs:{"sticky":""}},[_c('navbar',{attrs:{"type":"dark"},scopedSlots:_u([{key:"brand",fn:function(){return [_c('a',{staticClass:"navbar-brand",attrs:{"href":"/tp/index.html","title":"Home"}},[_c('img',{staticStyle:{"height":"40px"},attrs:{"src":"/tp/images/VitaBookLogo.png","alt":"VitaBook"}})])]},proxy:true},{key:"right",fn:function(){return [_c('li',[_c('form',{staticClass:"navbar-form"},[_c('searchbar',{attrs:{"data":searchData,"placeholder":"Search","on-hit":searchCallback,"menu-align-right":""}})],1)])]},proxy:true}])},[_v(" "),_c('li',[_c('a',{staticClass:"nav-link",attrs:{"href":"/tp/index.html"}},[_v("Home")])]),_v(" "),_c('li',[_c('a',{staticClass:"nav-link",attrs:{"href":"/tp/UserGuide.html"}},[_v("User Guide")])]),_v(" "),_c('li',[_c('a',{staticClass:"nav-link",attrs:{"href":"/tp/DeveloperGuide.html"}},[_v("Developer Guide")])]),_v(" "),_c('li',[_c('a',{staticClass:"nav-link",attrs:{"href":"/tp/AboutUs.html"}},[_v("About Us")])]),_v(" "),_c('li',[_c('a',{staticClass:"nav-link",attrs:{"href":"https://github.com/AY2425S2-CS2103T-F11-2/tp","target":"_blank"}},[_c('span',[_c('span',{staticClass:"fab fa-github",attrs:{"aria-hidden":"true"}})])])])])],1),_v(" "),_c('div',{attrs:{"id":"flex-body"}},[_c('div',{attrs:{"id":"content-wrapper"}},[_m(1),_v(" "),_m(2),_v(" "),_c('p',[_v("This Developer Guide provides in-depth documentation on how VitaBook is designed and implemented.\nIt covers the architecture of VitaBook, detailed specifications on smaller pieces of the design, and an outline of\nall parts of the software and how they will work.")]),_v(" "),_c('p',[_v("You can use this guide to maintain, upgrade, and evolve VitaBook.")]),_v(" "),_c('p',[_v("This Developer Guide is accurate as of 2 April 2025.")]),_v(" "),_m(3),_v(" "),_c('hr'),_v(" "),_m(4),_v(" "),_m(5),_v(" "),_c('hr'),_v(" "),_m(6),_v(" "),_c('p',[_v("We would like to acknowledge the following:")]),_v(" "),_m(7),_v(" "),_m(8),_v(" "),_m(9),_v(" "),_m(10),_v(" "),_m(11),_v(" "),_m(12),_v(" "),_m(13),_v(" "),_m(14),_v(" "),_m(15),_v(" "),_m(16),_v(" "),_m(17),_v(" "),_m(18),_v(" "),_m(19),_v(" "),_c('hr'),_v(" "),_m(20),_v(" "),_m(21),_v(" "),_c('hr'),_v(" "),_m(22),_v(" "),_m(23),_v(" "),_m(24),_v(" "),_m(25),_v(" "),_m(26),_v(" "),_m(27),_v(" "),_m(28),_v(" "),_m(29),_v(" "),_m(30),_m(31),_v(" "),_m(32),_v(" "),_m(33),_v(" "),_c('p',[_v("If content appears unclear:")]),_v(" "),_m(34),_v(" "),_c('hr'),_v(" "),_m(35),_v(" "),_m(36),_v(" "),_m(37),_v(" "),_m(38),_v(" "),_m(39),_v(" "),_m(40),_v(" "),_m(41),_v(" "),_m(42),_v(" "),_m(43),_v(" "),_m(44),_c('p',[_v("VitaBook is designed with four main components:")]),_v(" "),_m(45),_v(" "),_m(46),_v(" "),_m(47),_v(" "),_m(48),_v(" "),_c('pic',{attrs:{"src":"/tp/diagrams/ArchitectureDiagram.png","width":"280"}}),_v(" "),_m(49),_v(" "),_m(50),_v(" "),_m(51),_v(" "),_m(52),_v(" "),_c('p',[_v("The bulk of the app's work is done by the following four components:")]),_v(" "),_m(53),_v(" "),_m(54),_v(" "),_m(55),_v(" "),_m(56),_v(" "),_c('pic',{attrs:{"src":"/tp/diagrams/ArchitectureSequenceDiagram.png","width":"574"}}),_v(" "),_c('p',[_v("Each of the four main components (also shown in the diagram above),")]),_v(" "),_m(57),_v(" "),_m(58),_v(" "),_c('pic',{attrs:{"src":"/tp/diagrams/ComponentManagers.png","width":"300"}}),_v(" "),_c('p',[_v("The sections below give more details of each component.")]),_v(" "),_m(59),_v(" "),_m(60),_v(" "),_c('pic',{attrs:{"src":"/tp/diagrams/UiClassDiagram.png","alt":"Structure of the UI Component"}}),_v(" "),_m(61),_v(" "),_m(62),_v(" "),_m(63),_v(" "),_m(64),_v(" "),_m(65),_v(" "),_m(66),_v(" "),_m(67),_v(" "),_c('pic',{attrs:{"src":"/tp/diagrams/LogicClassDiagram.png","width":"550"}}),_v(" "),_m(68),_v(" "),_c('pic',{attrs:{"src":"/tp/diagrams/DeleteSequenceDiagram.png","alt":"Interactions Inside the Logic Component for the `delete 1` Command"}}),_v(" "),_c('box',{attrs:{"type":"info","seamless":""}},[_c('p',[_c('strong',[_v("Note:")]),_v(" The lifeline for "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("DeleteCommandParser")]),_v(" should end at the destroy marker (X) but due to a limitation of PlantUML, the lifeline continues till the end of diagram.")])]),_v(" "),_m(69),_v(" "),_m(70),_v(" "),_m(71),_v(" "),_c('pic',{attrs:{"src":"/tp/diagrams/ParserClasses.png","width":"600"}}),_v(" "),_c('p',[_v("How the parsing works:")]),_v(" "),_m(72),_v(" "),_m(73),_v(" "),_m(74),_v(" "),_c('pic',{attrs:{"src":"/tp/diagrams/ModelClassDiagram.png","width":"1000"}}),_v(" "),_m(75),_v(" "),_m(76),_v(" "),_c('box',{attrs:{"type":"info","seamless":""}},[_c('p',[_c('strong',[_v("Note:")]),_v(" An alternative (arguably, a more OOP) model is given below. It has a "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Allergy")]),_v(" list in the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("AddressBook")]),_v(", which "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Person")]),_v(" references. This allows "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("AddressBook")]),_v(" to only require one "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Allergy")]),_v(" object per unique allergy, instead of each "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Person")]),_v(" needing their own "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Allergy")]),_v(" objects."),_c('br')]),_v(" "),_c('pic',{attrs:{"src":"/tp/diagrams/BetterModelClassDiagram.png","width":"1000"}})],1),_v(" "),_m(77),_v(" "),_m(78),_v(" "),_c('pic',{attrs:{"src":"/tp/diagrams/StorageClassDiagram.png","width":"550"}}),_v(" "),_m(79),_v(" "),_m(80),_v(" "),_m(81),_v(" "),_m(82),_v(" "),_c('hr'),_v(" "),_m(83),_v(" "),_c('p',[_v("This section describes some noteworthy details on how certain features are implemented.")]),_v(" "),_m(84),_v(" "),_c('pic',{attrs:{"src":"/tp/diagrams/AddCommandClassDiagram.png","alt":"AddCommand Class Diagram"}}),_v(" "),_m(85),_v(" "),_m(86),_v(" "),_m(87),_v(" "),_m(88),_m(89),_v(" "),_m(90),_v(" "),_m(91),_v(" "),_m(92),_v(" "),_m(93),_v(" "),_c('p',[_v("The following sequence diagram outlines the flow of the AddCommand:")]),_v(" "),_c('pic',{attrs:{"src":"/tp/diagrams/AddCommandSequenceDiagram.png","alt":"AddCommand Sequence Diagram"}}),_v(" "),_c('hr'),_v(" "),_m(94),_v(" "),_c('pic',{attrs:{"src":"/tp/diagrams/EditCommandClassDiagram.png","alt":"EditCommand Class Diagram"}}),_v(" "),_m(95),_v(" "),_m(96),_v(" "),_m(97),_v(" "),_m(98),_v(" "),_m(99),_v(" "),_m(100),_m(101),_v(" "),_m(102),_v(" "),_m(103),_v(" "),_m(104),_v(" "),_m(105),_v(" "),_c('p',[_v("The sequence diagram below depicts the interaction of components involved:")]),_v(" "),_c('pic',{attrs:{"src":"/tp/diagrams/EditCommandSequenceDiagram.png","alt":"EditCommand Sequence Diagram"}}),_v(" "),_m(106),_v(" "),_c('pic',{attrs:{"src":"/tp/diagrams/ClearCommandClassDiagram.png","alt":"ClearCommand Class Diagram"}}),_v(" "),_m(107),_v(" "),_m(108),_v(" "),_m(109),_v(" "),_m(110),_m(111),_v(" "),_m(112),_v(" "),_m(113),_v(" "),_m(114),_v(" "),_m(115),_v(" "),_c('p',[_v("The process is visualized in the following sequence diagram:")]),_v(" "),_c('pic',{attrs:{"src":"/tp/diagrams/ClearCommandSequenceDiagram.png","alt":"ClearCommand Sequence Diagram"}}),_v(" "),_m(116),_v(" "),_c('pic',{attrs:{"src":"/tp/diagrams/priority-command/PriorityCommandClassDiagram.png","alt":"PriorityCommand Class Diagram"}}),_v(" "),_m(117),_v(" "),_m(118),_v(" "),_m(119),_v(" "),_m(120),_m(121),_v(" "),_m(122),_v(" "),_m(123),_v(" "),_m(124),_v(" "),_m(125),_v(" "),_c('p',[_v("The sequence diagram below illustrates the interactions between the components when executing the priority command:")]),_v(" "),_c('pic',{attrs:{"src":"/tp/diagrams/priority-command/PriorityCommandSequenceDiagram.png","alt":"PriorityCommand Sequence Diagram"}}),_v(" "),_m(126),_v(" "),_m(127),_v(" "),_c('pic',{attrs:{"src":"/tp/diagrams/SortCommandSequenceDiagram.png","alt":"Interactions Inside the Logic Component for the `sort priority` Command"}}),_v(" "),_c('box',{attrs:{"type":"info","seamless":""}},[_c('p',[_c('strong',[_v("Note:")]),_v(" The lifeline for "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("SortCommandParser")]),_v(" should end at the destroy marker (X), but due to a limitation of PlantUML, the lifeline continues till the end of the diagram.")])]),_v(" "),_m(128),_v(" "),_m(129),_v(" "),_m(130),_m(131),_v(" "),_m(132),_v(" "),_m(133),_v(" "),_m(134),_v(" "),_m(135),_v(" "),_m(136),_v(" "),_m(137),_v(" "),_c('pic',{attrs:{"src":"/tp/diagrams/FilterCommandSequenceDiagram.png","alt":"Interactions Inside the Logic Component for the `filter d/low fat` Command"}}),_v(" "),_c('box',{attrs:{"type":"info","seamless":""}},[_c('p',[_c('strong',[_v("Note:")]),_v(" The lifeline for FilterCommandParser should end at the destroy marker (X), but due to a limitation of PlantUML, the lifeline continues till the end of the diagram.")])]),_v(" "),_m(138),_v(" "),_m(139),_v(" "),_m(140),_m(141),_v(" "),_m(142),_v(" "),_m(143),_v(" "),_m(144),_v(" "),_m(145),_v(" "),_m(146),_v(" "),_c('p',[_v("The sequence diagram below illustrates the interaction flow when a user enters commands and navigates through command history")]),_v(" "),_c('pic',{attrs:{"src":"/tp/diagrams/CommandHistorySequenceDiagram.png","alt":"Command History Sequence Diagram"}}),_v(" "),_c('p',[_v("The CommandHistory class tracks all executed commands, allowing users to navigate through past commands using UP/DOWN arrow keys. It maintains:")]),_v(" "),_m(147),_v(" "),_m(148),_v(" "),_m(149),_v(" "),_m(150),_m(151),_v(" "),_m(152),_m(153),_v(" "),_m(154),_v(" "),_m(155),_v(" "),_m(156),_v(" "),_m(157),_v(" "),_m(158),_v(" "),_m(159),_v(" "),_m(160),_v(" "),_m(161),_m(162),_v(" "),_m(163),_m(164),_v(" "),_m(165),_v(" "),_c('p',[_v("Additionally, it implements the following operations:")]),_v(" "),_m(166),_v(" "),_m(167),_v(" "),_m(168),_v(" "),_c('pic',{attrs:{"src":"/tp/diagrams/UndoRedoState0.png","alt":"UndoRedoState0"}}),_v(" "),_m(169),_v(" "),_c('pic',{attrs:{"src":"/tp/diagrams/UndoRedoState1.png","alt":"UndoRedoState1"}}),_v(" "),_m(170),_v(" "),_c('pic',{attrs:{"src":"/tp/diagrams/UndoRedoState2.png","alt":"UndoRedoState2"}}),_v(" "),_c('box',{attrs:{"type":"info","seamless":""}},[_c('p',[_c('strong',[_v("Note:")]),_v(" If a command fails its execution, it will not call "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Model#commitAddressBook()")]),_v(", so the address book state will not be saved into the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("addressBookStateList")]),_v(".")])]),_v(" "),_m(171),_v(" "),_c('pic',{attrs:{"src":"/tp/diagrams/UndoRedoState3.png","alt":"UndoRedoState3"}}),_v(" "),_c('box',{attrs:{"type":"info","seamless":""}},[_c('p',[_c('strong',[_v("Note:")]),_v(" If the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("currentStatePointer")]),_v(" is at index 0, pointing to the initial AddressBook state, then there are no previous AddressBook states to restore. The "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("undo")]),_v(" command uses "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Model#canUndoAddressBook()")]),_v(" to check if this is the case. If so, it will return an error to the user rather\nthan attempting to perform the undo.")])]),_v(" "),_m(172),_v(" "),_c('pic',{attrs:{"src":"/tp/diagrams/UndoSequenceDiagram-Logic.png","alt":"UndoSequenceDiagram-Logic"}}),_v(" "),_c('box',{attrs:{"type":"info","seamless":""}},[_c('p',[_c('strong',[_v("Note:")]),_v(" The lifeline for "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("UndoCommand")]),_v(" should end at the destroy marker (X) but due to a limitation of PlantUML, the lifeline reaches the end of diagram.")])]),_v(" "),_m(173),_v(" "),_c('pic',{attrs:{"src":"/tp/diagrams/UndoSequenceDiagram-Model.png","alt":"UndoSequenceDiagram-Model"}}),_v(" "),_m(174),_v(" "),_c('box',{attrs:{"type":"info","seamless":""}},[_c('p',[_c('strong',[_v("Note:")]),_v(" If the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("currentStatePointer")]),_v(" is at index "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("addressBookStateList.size() - 1")]),_v(", pointing to the latest address book state, then there are no undone AddressBook states to restore. The "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("redo")]),_v(" command uses "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Model#canRedoAddressBook()")]),_v(" to check if this is the case. If so, it will return an error to the user rather than attempting to perform the redo.")])]),_v(" "),_m(175),_v(" "),_c('pic',{attrs:{"src":"/tp/diagrams/UndoRedoState4.png","alt":"UndoRedoState4"}}),_v(" "),_m(176),_v(" "),_c('pic',{attrs:{"src":"/tp/diagrams/UndoRedoState5.png","alt":"UndoRedoState5"}}),_v(" "),_c('p',[_v("The following activity diagram summarizes what happens when a user executes a new command:")]),_v(" "),_c('pic',{attrs:{"src":"/tp/diagrams/CommitActivityDiagram.png","width":"250"}}),_v(" "),_m(177),_v(" "),_c('hr'),_v(" "),_m(178),_v(" "),_m(179),_v(" "),_m(180),_m(181),_v(" "),_m(182),_c('hr'),_v(" "),_m(183),_v(" "),_m(184),_v(" "),_c('hr'),_v(" "),_m(185),_v(" "),_m(186),_v(" "),_m(187),_v(" "),_m(188),_v(" "),_m(189),_v(" "),_m(190),_v(" "),_m(191),_v(" "),_m(192),_v(" "),_m(193),_v(" "),_m(194),_c('p',[_v("User stories for the MVP version:")]),_v(" "),_m(195),_m(196),_v(" "),_m(197),_v(" "),_m(198),_v(" "),_m(199),_v(" "),_m(200),_m(201),_v(" "),_m(202),_v(" "),_m(203),_m(204),_v(" "),_m(205),_v(" "),_m(206),_m(207),_v(" "),_m(208),_v(" "),_m(209),_m(210),_v(" "),_m(211),_v(" "),_m(212),_m(213),_v(" "),_m(214),_v(" "),_m(215),_m(216),_v(" "),_m(217),_v(" "),_m(218),_m(219),_v(" "),_m(220),_v(" "),_m(221),_m(222),_v(" "),_m(223),_v(" "),_m(224),_m(225),_v(" "),_m(226),_v(" "),_m(227),_m(228),_v(" "),_m(229),_v(" "),_m(230),_m(231),_v(" "),_m(232),_v(" "),_m(233),_m(234),_v(" "),_m(235),_v(" "),_m(236),_m(237),_v(" "),_m(238),_m(239),_v(" "),_m(240),_m(241),_v(" "),_m(242),_m(243),_v(" "),_m(244),_m(245),_v(" "),_m(246),_m(247),_v(" "),_m(248),_v(" "),_m(249),_m(250),_v(" "),_m(251),_m(252),_v(" "),_m(253),_m(254),_v(" "),_m(255),_m(256),_v(" "),_m(257),_c('hr'),_v(" "),_m(258),_v(" "),_c('p',[_v("Given below are instructions to test the app manually.")]),_v(" "),_m(259),_v(" "),_c('hr'),_v(" "),_m(260),_v(" "),_m(261),_v(" "),_c('hr'),_v(" "),_m(262),_v(" "),_m(263),_v(" "),_m(264),_m(265),_v(" "),_m(266),_m(267),_v(" "),_m(268),_m(269),_v(" "),_m(270),_m(271),_v(" "),_m(272),_m(273),_v(" "),_m(274),_m(275),_v(" "),_m(276),_m(277),_v(" "),_m(278),_m(279),_v(" "),_m(280),_c('hr'),_v(" "),_m(281),_v(" "),_m(282),_c('hr'),_v(" "),_m(283),_v(" "),_m(284),_c('hr'),_v(" "),_m(285),_v(" "),_m(286),_v(" "),_m(287)],1),_v(" "),_c('overlay-source',{attrs:{"id":"page-nav","tag-name":"nav","to":"page-nav"}},[_c('div',{staticClass:"nav-component slim-scroll"},[_c('overlay-source',{staticClass:"nav nav-pills flex-column my-0 small no-flex-wrap",attrs:{"id":"mb-page-nav","tag-name":"nav","to":"mb-page-nav"}},[_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#vitabook-developer-guide"}},[_v("VitaBook Developer Guide‎")]),_v(" "),_c('nav',{staticClass:"nav nav-pills flex-column my-0 nested no-flex-wrap"},[_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#table-of-contents"}},[_v("Table of Contents‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#acknowledgements"}},[_v("Acknowledgements‎")]),_v(" "),_c('nav',{staticClass:"nav nav-pills flex-column my-0 nested no-flex-wrap"},[_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#java-dependencies"}},[_v("Java Dependencies‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#documentation-tools"}},[_v("Documentation Tools‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#fonts-used-in-the-application"}},[_v("Fonts Used in the Application‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#ui-and-code-inspirations"}},[_v("UI and Code Inspirations‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#badges-and-icons"}},[_v("Badges and Icons‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#special-thanks"}},[_v("Special Thanks‎")])]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#setting-up-getting-started"}},[_v("Setting up, getting started‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#how-to-use-this-developer-guide"}},[_v("How to Use This Developer Guide‎")]),_v(" "),_c('nav',{staticClass:"nav nav-pills flex-column my-0 nested no-flex-wrap"},[_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#overview"}},[_v("Overview‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#navigation-tips"}},[_v("Navigation Tips‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#reader-pathways"}},[_v("Reader Pathways‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#key-conventions"}},[_v("Key Conventions‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#troubleshooting"}},[_v("Troubleshooting‎")])]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#design"}},[_v("Design‎")]),_v(" "),_c('nav',{staticClass:"nav nav-pills flex-column my-0 nested no-flex-wrap"},[_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#navigation-guide"}},[_v("Navigation Guide‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#system-overview"}},[_v("System Overview‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#architecture"}},[_v("Architecture‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#ui-component"}},[_v("UI component‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#logic-component"}},[_v("Logic component‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#model-component"}},[_v("Model component‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#storage-component"}},[_v("Storage component‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#common-classes"}},[_v("Common classes‎")])]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#implementation"}},[_v("Implementation‎")]),_v(" "),_c('nav',{staticClass:"nav nav-pills flex-column my-0 nested no-flex-wrap"},[_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#add-command-implementation"}},[_v("Add Command Implementation‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#edit-command-implementation"}},[_v("Edit Command Implementation‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#clear-command-implementation"}},[_v("Clear Command Implementation‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#priority-command-implementation"}},[_v("Priority Command Implementation‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#sort-command-implementation"}},[_v("Sort Command Implementation‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#filter-command-implementation"}},[_v("Filter Command Implementation‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#command-history-implementation"}},[_v("Command History Implementation‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#undo-redo-command-implementation"}},[_v("Undo/redo Command Implementation‎")])]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#edge-cases"}},[_v("Edge Cases‎")]),_v(" "),_c('nav',{staticClass:"nav nav-pills flex-column my-0 nested no-flex-wrap"},[_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#command-specific-edge-cases"}},[_v("Command-Specific Edge Cases‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#general-edge-cases"}},[_v("General Edge Cases‎")])]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#documentation-logging-testing-configuration-dev-ops"}},[_v("Documentation, logging, testing, configuration, dev-ops‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#appendix-requirements"}},[_v("Appendix: Requirements‎")]),_v(" "),_c('nav',{staticClass:"nav nav-pills flex-column my-0 nested no-flex-wrap"},[_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#product-scope"}},[_v("Product scope‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#user-stories"}},[_v("User stories‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#use-cases"}},[_v("Use cases‎")])]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#non-functional-requirements-nfrs"}},[_v("Non-Functional Requirements (NFRs)‎")]),_v(" "),_c('nav',{staticClass:"nav nav-pills flex-column my-0 nested no-flex-wrap"},[_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#1-performance"}},[_v("1. Performance‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#2-usability"}},[_v("2. Usability‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#3-compatibility"}},[_v("3. Compatibility‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#4-data-integrity"}},[_v("4. Data Integrity‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#5-security"}},[_v("5. Security‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#6-scalability"}},[_v("6. Scalability‎")])]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#glossary"}},[_v("Glossary‎")]),_v(" "),_c('nav',{staticClass:"nav nav-pills flex-column my-0 nested no-flex-wrap"},[_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#core-concepts"}},[_v("Core Concepts‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#technical-terms"}},[_v("Technical Terms‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#medical-dietary-terms"}},[_v("Medical/Dietary Terms‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#command-syntax"}},[_v("Command Syntax‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#key-features"}},[_v("Key Features‎")])]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#appendix-instructions-for-manual-testing"}},[_v("Appendix: Instructions for manual testing‎")]),_v(" "),_c('nav',{staticClass:"nav nav-pills flex-column my-0 nested no-flex-wrap"},[_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#launch-and-shutdown"}},[_v("Launch and Shutdown‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#command-tests"}},[_v("Command Tests‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#undo-redo-testing"}},[_v("Undo/Redo Testing‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#general-edge-cases-2"}},[_v("General Edge Cases‎")]),_v(" "),_c('a',{pre:true,attrs:{"class":"nav-link py-1","href":"#exploratory-testing-tips"}},[_v("Exploratory Testing Tips‎")])])])])],1)]),_v(" "),_c('scroll-top-button')],1),_v(" "),_m(288)])}
};
    var pageVueStaticRenderFns = [function anonymous(
) {
with(this){return _c('head',[_c('link',{attrs:{"rel":"preconnect","href":"https://fonts.googleapis.com"}}),_v(" "),_c('link',{attrs:{"rel":"preconnect","href":"https://fonts.gstatic.com","crossorigin":""}}),_v(" "),_c('link',{attrs:{"href":"https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600;700&display=swap","rel":"stylesheet"}})])}
},function anonymous(
) {
with(this){return _c('h1',{attrs:{"id":"vitabook-developer-guide"}},[_v("VitaBook Developer Guide"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#vitabook-developer-guide","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_v("VitaBook")]),_v(" is a "),_c('strong',[_v("desktop application for freelance nutritionists")]),_v("\nto manage patient profiles, dietary information, and follow-ups efficiently.\nBuilt for speed and efficiency, VitaBook integrates a powerful "),_c('strong',[_v("Command Line Interface (CLI)")]),_v(" with a clean.\n"),_c('strong',[_v("Graphical User Interface (GUI)")]),_v(", allowing you to quickly retrieve and update patient records while on the go.")])}
},function anonymous(
) {
with(this){return _c('p',[_v("Head over to "),_c('a',{attrs:{"href":"#how-to-use-this-developer-guide"}},[_v("How to use this Developer Guide")]),_v("\nto get started!")])}
},function anonymous(
) {
with(this){return _c('h2',{attrs:{"id":"table-of-contents"}},[_v("Table of Contents"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#table-of-contents","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('ol',[_c('li',[_c('p',[_c('a',{attrs:{"href":"#vitabook-developer-guide"}},[_v("Introduction")])]),_v(" "),_c('ol',[_c('li',[_c('a',{attrs:{"href":"#about-us"}},[_v("About Us")])]),_v(" "),_c('li',[_c('a',{attrs:{"href":"#acknowledgements"}},[_v("Acknowledgements")])]),_v(" "),_c('li',[_c('a',{attrs:{"href":"#setting-up-getting-started"}},[_v("Setting up, getting started")])]),_v(" "),_c('li',[_c('a',{attrs:{"href":"#how-to-use-this-developer-guide"}},[_v("How to Use This Developer Guide")])])])]),_v(" "),_c('li',[_c('p',[_c('a',{attrs:{"href":"#design"}},[_v("Design")])]),_v(" "),_c('ol',[_c('li',[_c('a',{attrs:{"href":"#architecture"}},[_v("Architecture")]),_v(" "),_c('ul',[_c('li',[_c('a',{attrs:{"href":"#architecture"}},[_v("Component Diagram")])]),_v(" "),_c('li',[_c('a',{attrs:{"href":"#architecture-sequence-diagram"}},[_v("Sequence Diagram")])])])]),_v(" "),_c('li',[_c('a',{attrs:{"href":"#ui-component"}},[_v("UI Component")])]),_v(" "),_c('li',[_c('a',{attrs:{"href":"#logic-component"}},[_v("Logic Component")]),_v(" "),_c('ul',[_c('li',[_c('a',{attrs:{"href":"#parser-classes"}},[_v("Parser Classes")])])])]),_v(" "),_c('li',[_c('a',{attrs:{"href":"#model-component"}},[_v("Model Component")])]),_v(" "),_c('li',[_c('a',{attrs:{"href":"#storage-component"}},[_v("Storage Component")])]),_v(" "),_c('li',[_c('a',{attrs:{"href":"#common-classes"}},[_v("Common Classes")])])])]),_v(" "),_c('li',[_c('p',[_c('a',{attrs:{"href":"#implementation"}},[_v("Implementation")])]),_v(" "),_c('ol',[_c('li',[_c('a',{attrs:{"href":"#add-command-implementation"}},[_v("Add Command")])]),_v(" "),_c('li',[_c('a',{attrs:{"href":"#edit-command-implementation"}},[_v("Edit Command")])]),_v(" "),_c('li',[_c('a',{attrs:{"href":"#clear-command-implementation"}},[_v("Clear Command")])]),_v(" "),_c('li',[_c('a',{attrs:{"href":"#priority-command-implementation"}},[_v("Priority Command")])]),_v(" "),_c('li',[_c('a',{attrs:{"href":"#sort-command-implementation"}},[_v("Sort Command")])]),_v(" "),_c('li',[_c('a',{attrs:{"href":"#filter-command-implementation"}},[_v("Filter Command")])]),_v(" "),_c('li',[_c('a',{attrs:{"href":"#command-history-implementation"}},[_v("Command History")])]),_v(" "),_c('li',[_c('a',{attrs:{"href":"#undoredo-command-implementation"}},[_v("Undo/Redo Command")])])])]),_v(" "),_c('li',[_c('p',[_c('a',{attrs:{"href":"#documentation-logging-testing-configuration-dev-ops"}},[_v("Documentation, logging, testing, configuration, dev-ops")])])]),_v(" "),_c('li',[_c('p',[_c('a',{attrs:{"href":"#appendix"}},[_v("Appendix")])]),_v(" "),_c('ol',[_c('li',[_c('a',{attrs:{"href":"#appendix-requirements"}},[_v("Requirements")]),_v(" "),_c('ol',[_c('li',[_c('a',{attrs:{"href":"#product-scope"}},[_v("Product Scope")])]),_v(" "),_c('li',[_c('a',{attrs:{"href":"#user-stories"}},[_v("User Stories")])]),_v(" "),_c('li',[_c('a',{attrs:{"href":"#use-cases"}},[_v("Use Cases")])]),_v(" "),_c('li',[_c('a',{attrs:{"href":"#non-functional-requirements"}},[_v("Non-Functional Requirements")])]),_v(" "),_c('li',[_c('a',{attrs:{"href":"#glossary"}},[_v("Glossary")])])])]),_v(" "),_c('li',[_c('a',{attrs:{"href":"#appendix-instructions-for-manual-testing"}},[_v("Manual Testing")])])])])])}
},function anonymous(
) {
with(this){return _c('h2',{attrs:{"id":"acknowledgements"}},[_c('strong',[_v("Acknowledgements")]),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#acknowledgements","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_v("Our course instructors and teaching assistants for their guidance and feedback throughout the development process.")]),_v(" "),_c('li',[_v("Our peers and collaborators who provided support, code reviews, and valuable discussions.")]),_v(" "),_c('li',[_v("The open-source Java and JavaFX communities for documentation and tools that supported this project.")]),_v(" "),_c('li',[_v("The maintainers of relevant libraries and tools used in the project, such as Jackson for JSON processing and JUnit for testing.")])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"java-dependencies"}},[_v("Java Dependencies"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#java-dependencies","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_c('strong',[_v("JavaFX")]),_v(" – for GUI rendering and user interaction")]),_v(" "),_c('li',[_c('strong',[_v("Jackson")]),_v(" – for JSON serialization and deserialization")]),_v(" "),_c('li',[_c('strong',[_v("JUnit 5")]),_v(" – for unit testing")]),_v(" "),_c('li',[_c('strong',[_v("TestFX")]),_v(" – for JavaFX GUI testing")]),_v(" "),_c('li',[_c('strong',[_v("Apache Commons Lang")]),_v(" – for additional utility methods")]),_v(" "),_c('li',[_c('strong',[_v("JaCoCo")]),_v(" – for generating test coverage reports")]),_v(" "),_c('li',[_c('strong',[_v("Gradle Shadow Plugin")]),_v(" – for building executable JARs")]),_v(" "),_c('li',[_c('strong',[_v("Checkstyle")]),_v(" – for enforcing coding standards")])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"documentation-tools"}},[_v("Documentation Tools"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#documentation-tools","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_c('strong',[_v("MarkBind")]),_v(" – for authoring and building the project website")]),_v(" "),_c('li',[_c('strong',[_v("PlantUML")]),_v(" – for generating UML diagrams used in the Developer Guide")])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"fonts-used-in-the-application"}},[_v("Fonts Used in the Application"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#fonts-used-in-the-application","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_c('strong',[_v("Segoe UI")]),_v(", "),_c('strong',[_v("Segoe UI Light")]),_v(", "),_c('strong',[_v("Segoe UI Semibold")]),_v(" – used for GUI text elements")]),_v(" "),_c('li',[_c('strong',[_v("Georgia")]),_v(" – used for headers and titles")]),_v(" "),_c('li',[_c('strong',[_v("Open Sans")]),_v(" – used in certain label elements")]),_v(" "),_c('li',[_c('strong',[_v("Helvetica")]),_v(", "),_c('strong',[_v("Arial")]),_v(" – as fallback system fonts in UI components")])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"ui-and-code-inspirations"}},[_v("UI and Code Inspirations"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#ui-and-code-inspirations","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_c('strong',[_v("Metro-style JavaFX buttons")]),_v(" adapted from "),_c('a',{attrs:{"href":"https://pixelduke.wordpress.com/2012/10/23/jmetro-windows-8-controls-on-java/"}},[_v("Pedro Duque Vieira’s JMetro")])]),_v(" "),_c('li',[_c('strong',[_v("Color themes")]),_v(" guided by "),_c('a',{attrs:{"href":"https://www.schemecolor.com/"}},[_v("SchemeColor")]),_v(" and "),_c('a',{attrs:{"href":"https://coolors.co/"}},[_v("Coolors")])]),_v(" "),_c('li',[_v("CLI-GUI hybrid design inspired by the SE-EDU AddressBook examples")]),_v(" "),_c('li',[_v("Admonition and navigation layout patterns adapted from MarkBind presets and "),_c('a',{attrs:{"href":"https://docusaurus.io/"}},[_v("Docusaurus")]),_v(" design principles")])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"badges-and-icons"}},[_v("Badges and Icons"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#badges-and-icons","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_c('strong',[_v("GitHub Actions")]),_v(" – for CI status badges")]),_v(" "),_c('li',[_c('strong',[_v("Codecov")]),_v(" – for test coverage badge")]),_v(" "),_c('li',[_c('strong',[_v("GitHub Pages / Octicons")]),_v(" – for site layout and UI styling references")])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"special-thanks"}},[_v("Special Thanks"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#special-thanks","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_v("The SE-EDU team for maintaining the "),_c('strong',[_v("AddressBook-Level3")]),_v(" project")]),_v(" "),_c('li',[_v("We would like to thank the developers of the "),_c('a',{attrs:{"href":"https://github.com/se-edu/addressbook-level4"}},[_c('em',[_v("AddressBook-Level4 (AB4)")])]),_v(" project by the SE-EDU team, which served as a foundational reference for the architecture and testing approaches used of the GUI tests for this application.")])])}
},function anonymous(
) {
with(this){return _c('h2',{attrs:{"id":"setting-up-getting-started"}},[_c('strong',[_v("Setting up, getting started")]),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#setting-up-getting-started","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('p',[_v("Refer to the guide "),_c('a',{attrs:{"href":"/tp/SettingUp.html"}},[_c('em',[_v("Setting up and getting started")])]),_v(".")])}
},function anonymous(
) {
with(this){return _c('h2',{attrs:{"id":"how-to-use-this-developer-guide"}},[_v("How to Use This Developer Guide"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#how-to-use-this-developer-guide","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('p',[_v("Welcome, and thank you for your interest in understanding how "),_c('strong',[_v("VitaBook")]),_v(" works behind the scenes.")])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"overview"}},[_v("Overview"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#overview","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('p',[_v("This guide provides comprehensive technical documentation for "),_c('strong',[_v("VitaBook")]),_v(", covering:")])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_v("System architecture and design decisions")]),_v(" "),_c('li',[_v("Implementation details of key features")]),_v(" "),_c('li',[_v("Testing methodologies")]),_v(" "),_c('li',[_v("Maintenance and extension guidelines")])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"navigation-tips"}},[_v("Navigation Tips"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#navigation-tips","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('ol',[_c('li',[_c('p',[_c('strong',[_v("For Quick Answers")]),_v(":")]),_v(" "),_c('ul',[_c('li',[_v("Use "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Ctrl+F")]),_v(" to search for keywords")]),_v(" "),_c('li',[_v("Check the "),_c('a',{attrs:{"href":"#glossary"}},[_v("Glossary")]),_v(" for term definitions")]),_v(" "),_c('li',[_v("Jump to specific commands via the "),_c('a',{attrs:{"href":"#implementation"}},[_v("Implementation")]),_v(" section")])])]),_v(" "),_c('li',[_c('p',[_c('strong',[_v("For Deep Understanding")]),_v(":")]),_v(" "),_c('ul',[_c('li',[_v("Start with "),_c('a',{attrs:{"href":"#architecture"}},[_v("Architecture")]),_v(" for system overview")]),_v(" "),_c('li',[_v("Review "),_c('a',{attrs:{"href":"#implementation"}},[_v("Sequence Diagrams")]),_v(" for workflow visualization")]),_v(" "),_c('li',[_v("Examine "),_c('a',{attrs:{"href":"#appendix-instructions-for-manual-testing"}},[_v("Test Cases")]),_v(" for validation approaches")])])])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"reader-pathways"}},[_v("Reader Pathways"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#reader-pathways","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("If You're a...")]),_v(" "),_c('th',[_v("Start With")]),_v(" "),_c('th',[_v("Then Explore")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_c('strong',[_v("New Developer")])]),_v(" "),_c('td',[_c('a',{attrs:{"href":"#architecture"}},[_v("Architecture")])]),_v(" "),_c('td',[_c('a',{attrs:{"href":"#common-classes"}},[_v("Common Classes")]),_v(" → "),_c('a',{attrs:{"href":"#add-command-implementation"}},[_v("Add Command")])])]),_v(" "),_c('tr',[_c('td',[_c('strong',[_v("Tester")])]),_v(" "),_c('td',[_c('a',{attrs:{"href":"#appendix-instructions-for-manual-testing"}},[_v("Manual Testing")])]),_v(" "),_c('td',[_c('a',{attrs:{"href":"#user-stories"}},[_v("User Stories")]),_v(" → "),_c('a',{attrs:{"href":"#non-functional-requirements"}},[_v("Edge Cases")])])]),_v(" "),_c('tr',[_c('td',[_c('strong',[_v("Maintainer")])]),_v(" "),_c('td',[_c('a',{attrs:{"href":"#storage-component"}},[_v("Storage Component")])]),_v(" "),_c('td',[_c('a',{attrs:{"href":"#undoredo-command-implementation"}},[_v("Undo/Redo")]),_v(" → "),_c('a',{attrs:{"href":"#acknowledgements"}},[_v("Dependencies")])])])])])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"key-conventions"}},[_v("Key Conventions"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#key-conventions","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('ol',[_c('li',[_c('p',[_c('strong',[_v("Code References")]),_v(":")]),_v(" "),_c('ul',[_c('li',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("ClassName")]),_v(" for Java classes")]),_v(" "),_c('li',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("methodName()")]),_v(" for functions")]),_v(" "),_c('li',[_c('pre',[_c('code',{pre:true,attrs:{"class":"hljs"}},[_c('span',[_v("Java codeBlocks() for multi-line examples\n")]),_c('span',[_v("\n")])])])])])]),_v(" "),_c('li',[_c('p',[_c('strong',[_v("Visual Guides")]),_v(":")]),_v(" "),_c('ul',[_c('li',[_v("Diagrams use PlantUML ("),_c('a',{attrs:{"href":"#architecture"}},[_v("see examples")]),_v(")")]),_v(" "),_c('li',[_v("Test cases follow Given-When-Then format")])])]),_v(" "),_c('li',[_c('p',[_c('strong',[_v("Version Info")]),_v(":")]),_v(" "),_c('ul',[_c('li',[_v("All documentation matches "),_c('strong',[_v("VitaBook v2.1")])]),_v(" "),_c('li',[_v("Last updated: 2 April 2025")])])])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"troubleshooting"}},[_v("Troubleshooting"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#troubleshooting","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('ol',[_c('li',[_v("Check the "),_c('a',{attrs:{"href":"https://github.com/your-repo"}},[_v("latest version")]),_v(" on GitHub")]),_v(" "),_c('li',[_v("Compare with "),_c('a',{attrs:{"href":"#"}},[_v("API Docs")]),_v(" (if available)")]),_v(" "),_c('li',[_c('a',{attrs:{"href":"https://github.com/your-repo/issues"}},[_v("Open an issue")]),_v(" for clarification")])])}
},function anonymous(
) {
with(this){return _c('h2',{attrs:{"id":"design"}},[_c('strong',[_v("Design")]),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#design","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('p',[_v("This section provides a high-level overview of how "),_c('strong',[_v("VitaBook")]),_v(" is architected, and how its key components work together to support its core features.\nWhether you're new to software design or an experienced developer, use these navigation tips:")])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"navigation-guide"}},[_v("Navigation Guide"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#navigation-guide","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_v("For New Developers")]),_v(":")])}
},function anonymous(
) {
with(this){return _c('ol',[_c('li',[_v("Start with the "),_c('a',{attrs:{"href":"#architecture"}},[_v("Architecture Diagram")]),_v(" → High-level component map")]),_v(" "),_c('li',[_v("Learn how commands flow: "),_c('a',{attrs:{"href":"#logic-component"}},[_v("Delete Command Example")])]),_v(" "),_c('li',[_v("Explore the "),_c('a',{attrs:{"href":"#ui-component"}},[_v("UI Structure")]),_v(" → How JavaFX connects to code")])])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_v("For Experienced Developers")]),_v(":")])}
},function anonymous(
) {
with(this){return _c('ol',[_c('li',[_v("Review "),_c('a',{attrs:{"href":"#architecture"}},[_v("Component APIs")]),_v(" → Interface contracts")]),_v(" "),_c('li',[_v("Analyze "),_c('a',{attrs:{"href":"#model-component"}},[_v("Data Flow")]),_v(" → Model update patterns")]),_v(" "),_c('li',[_v("Check "),_c('a',{attrs:{"href":"#storage-component"}},[_v("Storage Layer")]),_v(" → JSON serialization")])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"system-overview"}},[_v("System Overview"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#system-overview","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('p',[_v("The "),_c('a',{attrs:{"href":"#architecture"}},[_v("Architecture")]),_v(" subsection presents a visual and conceptual overview of how VitaBook's major components interact with each other.")])}
},function anonymous(
) {
with(this){return _c('pre',[_c('code',{pre:true,attrs:{"class":"hljs plaintext"}},[_c('span',[_v("┌─────────────────┐    ┌─────────────────┐    ┌─────────────────┐\n")]),_c('span',[_v("│      UI         │    │     Logic       │    │     Model       │\n")]),_c('span',[_v("│ (JavaFX)        │◄──►│ (Command Parser)│◄──►│ (Patient Data)  │\n")]),_c('span',[_v("└─────────────────┘    └─────────────────┘    └────────┬────────┘\n")]),_c('span',[_v("                                                      ▲\n")]),_c('span',[_v("                                                      │\n")]),_c('span',[_v("                                               ┌──────▼──────┐\n")]),_c('span',[_v("                                               │   Storage   │\n")]),_c('span',[_v("                                               │  (JSON I/O) │\n")]),_c('span',[_v("                                               └─────────────┘\n")])])])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_c('strong',[_c('a',{attrs:{"href":"#ui-component"}},[_v("UI Component")])]),_v(" – Handles user interface rendering and interaction using JavaFX.")]),_v(" "),_c('li',[_c('strong',[_c('a',{attrs:{"href":"#logic-component"}},[_v("Logic Component")])]),_v(" – Parses and executes user commands via a central command parser.")]),_v(" "),_c('li',[_c('strong',[_c('a',{attrs:{"href":"#model-component"}},[_v("Model Component")])]),_v(" – Maintains the in-memory state of the application, including the patient list.")]),_v(" "),_c('li',[_c('strong',[_c('a',{attrs:{"href":"#storage-component"}},[_v("Storage Component")])]),_v(" – Reads from and writes to JSON files to persist user data.")])])}
},function anonymous(
) {
with(this){return _c('p',[_v("In addition, the "),_c('a',{attrs:{"href":"#common-classes"}},[_v("Common Classes")]),_v(" section documents utility classes shared across multiple packages.")])}
},function anonymous(
) {
with(this){return _c('blockquote',[_c('p',[_c('strong',[_v("Note:")]),_v(" All diagrams in this section (e.g., architecture, class, sequence diagrams) are generated using PlantUML.\nThe corresponding "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v(".puml")]),_v(" source files are located in the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("diagrams")]),_v(" folder of this project.\nYou can refer to the "),_c('a',{attrs:{"href":"https://se-education.org/guides/tutorials/plantUml.html"}},[_v("SE-EDU PlantUML Tutorial")]),_v(" if you wish to modify or create new diagrams for future enhancements.")])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"architecture"}},[_v("Architecture"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#architecture","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('p',[_v("The "),_c('em',[_c('strong',[_v("Architecture Diagram")])]),_v(" given above explains the high-level design of the App. Given below is a quick overview of main components and how they interact with each other.")])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_v("Main components of the architecture")])])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Main")])]),_v(" (consisting of classes "),_c('a',{attrs:{"href":"https://github.com/se-edu/addressbook-level3/tree/master/src/main/java/seedu/address/Main.java"}},[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Main")])]),_v(" and "),_c('a',{attrs:{"href":"https://github.com/se-edu/addressbook-level3/tree/master/src/main/java/seedu/address/MainApp.java"}},[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("MainApp")])]),_v(") is in charge of the app launch and shut down.")])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_v("At app launch, it initializes the other components in the correct sequence, and connects them up with each other.")]),_v(" "),_c('li',[_v("At shut down, it shuts down the other components and invokes cleanup methods where necessary.")])])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_c('a',{attrs:{"href":"#ui-component"}},[_c('strong',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("UI")])])]),_v(": The UI of the App.")]),_v(" "),_c('li',[_c('a',{attrs:{"href":"#logic-component"}},[_c('strong',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Logic")])])]),_v(": The command executor.")]),_v(" "),_c('li',[_c('a',{attrs:{"href":"#model-component"}},[_c('strong',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Model")])])]),_v(": Holds the data of the App in memory.")]),_v(" "),_c('li',[_c('a',{attrs:{"href":"#storage-component"}},[_c('strong',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Storage")])])]),_v(": Reads data from, and writes data to, the hard disk.")])])}
},function anonymous(
) {
with(this){return _c('p',[_c('a',{attrs:{"href":"#common-classes"}},[_c('strong',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Commons")])])]),_v(" represents a collection of classes used by multiple other components.")])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_v("How the architecture components interact with each other")])])}
},function anonymous(
) {
with(this){return _c('p',[_v("The "),_c('em',[_v("Sequence Diagram")]),_v(" below shows how the components interact with each other for the scenario where the user issues the command "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("delete 1")]),_v(".")])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_v("defines its "),_c('em',[_v("API")]),_v(" in an "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("interface")]),_v(" with the same name as the Component.")]),_v(" "),_c('li',[_v("implements its functionality using a concrete "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("{Component Name}Manager")]),_v(" class (which follows the corresponding API "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("interface")]),_v(" mentioned in the previous point.")])])}
},function anonymous(
) {
with(this){return _c('p',[_v("For example, the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Logic")]),_v(" component defines its API in the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Logic.java")]),_v(" interface and implements its functionality using the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("LogicManager.java")]),_v(" class which follows the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Logic")]),_v(" interface. Other components interact with a given component through its interface rather than the concrete class (reason: to prevent outside component's being coupled to the implementation of a component), as illustrated in the (partial) class diagram below.")])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"ui-component"}},[_v("UI component"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#ui-component","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('p',[_v("The "),_c('strong',[_v("API")]),_v(" of this component is specified in "),_c('a',{attrs:{"href":"https://github.com/se-edu/addressbook-level3/tree/master/src/main/java/seedu/address/ui/Ui.java"}},[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Ui.java")])])])}
},function anonymous(
) {
with(this){return _c('p',[_v("The UI consists of a "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("MainWindow")]),_v(" that is made up of parts e.g."),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("CommandBox")]),_v(", "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("ResultDisplay")]),_v(", "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("PersonListPanel")]),_v(", "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("StatusBarFooter")]),_v(" etc. All these, including the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("MainWindow")]),_v(", inherit from the abstract "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("UiPart")]),_v(" class which captures the commonalities between classes that represent parts of the visible GUI.")])}
},function anonymous(
) {
with(this){return _c('p',[_v("The "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("UI")]),_v(" component uses the JavaFx UI framework. The layout of these UI parts are defined in matching "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v(".fxml")]),_v(" files that are in the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("src/main/resources/view")]),_v(" folder. For example, the layout of the "),_c('a',{attrs:{"href":"https://github.com/se-edu/addressbook-level3/tree/master/src/main/java/seedu/address/ui/MainWindow.java"}},[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("MainWindow")])]),_v(" is specified in "),_c('a',{attrs:{"href":"https://github.com/se-edu/addressbook-level3/tree/master/src/main/resources/view/MainWindow.fxml"}},[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("MainWindow.fxml")])])])}
},function anonymous(
) {
with(this){return _c('p',[_v("The "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("UI")]),_v(" component:")])}
},function anonymous(
) {
with(this){return _c('ol',[_c('li',[_v("Executes user commands using the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Logic")]),_v(" component.")]),_v(" "),_c('li',[_v("Listens for changes to "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Model")]),_v(" data so that the UI can be updated with the modified data.")]),_v(" "),_c('li',[_v("Keeps a reference to the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Logic")]),_v(" component, because the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("UI")]),_v(" relies on the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Logic")]),_v(" to execute commands.")]),_v(" "),_c('li',[_v("Depends on some classes in the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Model")]),_v(" component, as it displays "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Person")]),_v(" object residing in the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Model")]),_v(".")])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"logic-component"}},[_v("Logic component"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#logic-component","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_v("API")]),_v(" : "),_c('a',{attrs:{"href":"https://github.com/se-edu/addressbook-level3/tree/master/src/main/java/seedu/address/logic/Logic.java"}},[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Logic.java")])])])}
},function anonymous(
) {
with(this){return _c('p',[_v("Here's a (partial) class diagram of the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Logic")]),_v(" component:")])}
},function anonymous(
) {
with(this){return _c('p',[_v("The sequence diagram below illustrates the interactions within the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Logic")]),_v(" component, taking "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("execute(\"delete 1\")")]),_v(" API call as an example.")])}
},function anonymous(
) {
with(this){return _c('p',[_v("How the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Logic")]),_v(" component works:")])}
},function anonymous(
) {
with(this){return _c('ol',[_c('li',[_v("When "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Logic")]),_v(" is called upon to execute a command, it is passed to an "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("AddressBookParser")]),_v(" object which in turn creates a parser that matches the command (e.g., "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("DeleteCommandParser")]),_v(") and uses it to parse the command.")]),_v(" "),_c('li',[_v("This results in a "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Command")]),_v(" object (more precisely, an object of one of its subclasses e.g., "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("DeleteCommand")]),_v(") which is executed by the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("LogicManager")]),_v(".")]),_v(" "),_c('li',[_v("The command can communicate with the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Model")]),_v(" when it is executed (e.g. to delete a person)."),_c('br'),_v("\nNote that although this is shown as a single step in the diagram above (for simplicity), in the code it can take several interactions (between the command object and the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Model")]),_v(") to achieve.")]),_v(" "),_c('li',[_v("The result of the command execution is encapsulated as a "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("CommandResult")]),_v(" object which is returned back from "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Logic")]),_v(".")])])}
},function anonymous(
) {
with(this){return _c('p',[_v("Here are the other classes in "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Logic")]),_v(" (omitted from the class diagram above) that are used for parsing a user command:")])}
},function anonymous(
) {
with(this){return _c('ol',[_c('li',[_v("When called upon to parse a user command, the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("AddressBookParser")]),_v(" class creates an "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("XYZCommandParser")]),_v(" ("),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("XYZ")]),_v(" is a placeholder for the specific command name e.g., "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("AddCommandParser")]),_v(") which uses the other classes shown above to parse the user command and create a "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("XYZCommand")]),_v(" object (e.g., "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("AddCommand")]),_v(") which the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("AddressBookParser")]),_v(" returns back as a "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Command")]),_v(" object.")]),_v(" "),_c('li',[_v("All "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("XYZCommandParser")]),_v(" classes (e.g., "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("AddCommandParser")]),_v(", "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("DeleteCommandParser")]),_v(", ...) inherit from the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Parser")]),_v(" interface so that they can be treated similarly where possible e.g, during testing.")])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"model-component"}},[_v("Model component"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#model-component","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_v("API")]),_v(" : "),_c('a',{attrs:{"href":"https://github.com/se-edu/addressbook-level3/tree/master/src/main/java/seedu/address/model/Model.java"}},[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Model.java")])])])}
},function anonymous(
) {
with(this){return _c('p',[_v("The "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Model")]),_v(" component:")])}
},function anonymous(
) {
with(this){return _c('ol',[_c('li',[_v("Stores the address book data i.e., all "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Person")]),_v(" objects (which are contained in a "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("UniquePersonList")]),_v(" object).")]),_v(" "),_c('li',[_v("Stores the currently 'selected' "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Person")]),_v(" objects (e.g., results of a search query) as a separate "),_c('em',[_v("filtered")]),_v(" list which is exposed to outsiders as an unmodifiable "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("ObservableList<Person>")]),_v(" that can be 'observed' e.g. the UI can be bound to this list so that the UI automatically updates when the data in the list change.")]),_v(" "),_c('li',[_v("Stores a "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("UserPref")]),_v(" object that represents the user’s preferences. This is exposed to the outside as a "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("ReadOnlyUserPref")]),_v(" objects.")]),_v(" "),_c('li',[_v("Does not depend on any of the other three components (as the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Model")]),_v(" represents data entities of the domain, they should make sense on their own without depending on other components)")])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"storage-component"}},[_v("Storage component"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#storage-component","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_v("API")]),_v(" : "),_c('a',{attrs:{"href":"https://github.com/se-edu/addressbook-level3/tree/master/src/main/java/seedu/address/storage/Storage.java"}},[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Storage.java")])])])}
},function anonymous(
) {
with(this){return _c('p',[_v("The "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Storage")]),_v(" component:")])}
},function anonymous(
) {
with(this){return _c('ol',[_c('li',[_v("can save both address book data and user preference data in JSON format, and read them back into corresponding objects.")]),_v(" "),_c('li',[_v("inherits from both "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("AddressBookStorage")]),_v(" and "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("UserPrefStorage")]),_v(", which means it can be treated as either one (if only the functionality of only one is needed).")]),_v(" "),_c('li',[_v("depends on some classes in the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Model")]),_v(" component (because the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Storage")]),_v(" component's job is to save/retrieve objects that belong to the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Model")]),_v(")")])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"common-classes"}},[_v("Common classes"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#common-classes","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('p',[_v("Classes used by multiple components are in the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("seedu.address.commons")]),_v(" package.")])}
},function anonymous(
) {
with(this){return _c('h2',{attrs:{"id":"implementation"}},[_c('strong',[_v("Implementation")]),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#implementation","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"add-command-implementation"}},[_v("Add Command Implementation"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#add-command-implementation","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('p',[_v("The "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("AddCommand")]),_v(" allows the user to register a new patient by specifying all the required fields such as name, gender, contact details, dietary needs, and medical priorities. This command ensures that each patient added is unique based on the email field.")])}
},function anonymous(
) {
with(this){return _c('h4',{attrs:{"id":"key-code-snippets"}},[_v("Key Code Snippets"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#key-code-snippets","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_v("Command Execution (Checks for duplicates before adding):")])])}
},function anonymous(
) {
with(this){return _c('pre',[_c('code',{pre:true,attrs:{"class":"hljs"}},[_c('span',[_v("@Override\n")]),_c('span',[_v("public CommandResult execute(Model model) throws CommandException {\n")]),_c('span',[_v("    requireNonNull(model);\n")]),_c('span',[_v("    if (model.hasPerson(toAdd)) {\n")]),_c('span',[_v("        throw new CommandException(MESSAGE_DUPLICATE_PERSON);\n")]),_c('span',[_v("    }\n")]),_c('span',[_v("    model.addPerson(toAdd);\n")]),_c('span',[_v("    return new CommandResult(String.format(MESSAGE_SUCCESS, Messages.format(toAdd)));\n")]),_c('span',[_v("}\n")])])])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_v("Example Usage:\n"),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("add n/John Doe g/m h/1.75 w/70 p/98765432 e/john@example.com a/123 Street d/vegan pr/high m/2025-12-31 al/peanuts")])])])}
},function anonymous(
) {
with(this){return _c('h4',{attrs:{"id":"developer-notes"}},[_v("Developer Notes"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#developer-notes","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_v("Validation: The Person constructor validates fields (e.g., Email format, Height range).")]),_v(" "),_c('li',[_v("Duplicate person criteria: If the email entered already exists in VitaBook, the person will be considered a duplicate. This is because in our unique context, the nutritionist uses the email to primarily contact the patient and send sensitive documents.")]),_v(" "),_c('li',[_v("Case Sensitivity: Allergies (al/) are case-insensitive (stored in lowercase).")])])}
},function anonymous(
) {
with(this){return _c('p',[_v("When a user issues a command such as "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("add n/John d/vegan")]),_v("(simplified for this example, this command does not actually run in VitaBook), the following sequence of operations occurs:")])}
},function anonymous(
) {
with(this){return _c('ol',[_c('li',[_v("The input is parsed by "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("AddCommandParser")]),_v(", which creates a "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Person")]),_v(" object and wraps it inside an "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("AddCommand")]),_v(".")]),_v(" "),_c('li',[_v("The "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("LogicManager")]),_v(" executes the command by calling its "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("execute(Model model)")]),_v(" method.")]),_v(" "),_c('li',[_v("Inside "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("AddCommand#execute()")]),_v(", the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Model")]),_v(" is checked for any duplicate entries using "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("hasPerson()")]),_v(".")]),_v(" "),_c('li',[_v("If no duplicates are found, the new "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Person")]),_v(" is added to the address book via "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("model.addPerson()")]),_v(".")]),_v(" "),_c('li',[_v("A "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("CommandResult")]),_v(" is returned with a success message.")])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"edit-command-implementation"}},[_v("Edit Command Implementation"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#edit-command-implementation","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('p',[_v("The "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("EditCommand")]),_v(" allows users to update one or more fields of an existing patient in the list. Fields that are not specified in the command remain unchanged.")])}
},function anonymous(
) {
with(this){return _c('h4',{attrs:{"id":"key-components"}},[_v("Key Components"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#key-components","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("EditPersonDescriptor")]),_v(": A helper class to track which fields are modified.")]),_v(" "),_c('li',[_v("Partial Updates: Only updates non-null fields in the descriptor.")])])}
},function anonymous(
) {
with(this){return _c('h4',{attrs:{"id":"key-code-snippets-2"}},[_v("Key Code Snippets"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#key-code-snippets-2","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_v("Creating an Edited Person (merges old and new fields)")])])}
},function anonymous(
) {
with(this){return _c('pre',[_c('code',{pre:true,attrs:{"class":"hljs"}},[_c('span',[_v("private static Person createEditedPerson(Person personToEdit, EditPersonDescriptor descriptor) {\n")]),_c('span',[_v("    Name updatedName = descriptor.getName().orElse(personToEdit.getName());\n")]),_c('span',[_v("    Phone updatedPhone = descriptor.getPhone().orElse(personToEdit.getPhone());\n")]),_c('span',[_v("    // ... (other fields)\n")]),_c('span',[_v("    return new Person(updatedName, updatedPhone, ...);\n")]),_c('span',[_v("}\n")])])])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_v("Example Usage:\n"),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("edit 1 p/91234567 e/new@example.com")])])])}
},function anonymous(
) {
with(this){return _c('h4',{attrs:{"id":"developer-notes-2"}},[_v("Developer Notes"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#developer-notes-2","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_v("Immutable Objects: Person is immutable; edits create a new object.")]),_v(" "),_c('li',[_v("Index Handling: Uses Index class to validate list bounds.")])])}
},function anonymous(
) {
with(this){return _c('p',[_v("When a user issues a command such as "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("edit 1 e/john@example.com")]),_v(", the following steps take place:")])}
},function anonymous(
) {
with(this){return _c('ol',[_c('li',[_v("The command is parsed by "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("EditCommandParser")]),_v(", which produces an "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("EditCommand")]),_v(" with an index and an "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("EditPersonDescriptor")]),_v(".")]),_v(" "),_c('li',[_v("The "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("LogicManager")]),_v(" invokes the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("execute()")]),_v(" method of the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("EditCommand")]),_v(".")]),_v(" "),_c('li',[_v("Inside "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("EditCommand#execute()")]),_v(", the selected patient is fetched from the filtered list using the index.")]),_v(" "),_c('li',[_v("A new "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Person")]),_v(" is created by merging the original details with the updated fields from "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("EditPersonDescriptor")]),_v(".")]),_v(" "),_c('li',[_v("If the new "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Person")]),_v(" is not a duplicate, "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("model.setPerson()")]),_v(" replaces the original person.")]),_v(" "),_c('li',[_v("A "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("CommandResult")]),_v(" is returned indicating the successful update.")])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"clear-command-implementation"}},[_v("Clear Command Implementation"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#clear-command-implementation","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('p',[_v("The "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("ClearCommand")]),_v(" removes all patient entries from the address book. To prevent accidental deletions, a confirmation dialog is shown (unless bypassed in test scenarios).")])}
},function anonymous(
) {
with(this){return _c('h4',{attrs:{"id":"key-code-snippets-3"}},[_v("Key Code Snippets"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#key-code-snippets-3","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_v("Confirmation Dialog (UI interaction)")])])}
},function anonymous(
) {
with(this){return _c('pre',[_c('code',{pre:true,attrs:{"class":"hljs"}},[_c('span',[_v("if (!requireConfirmation || ClearDialogUtil.showConfirmationDialog(...)) {\n")]),_c('span',[_v("    model.setAddressBook(new AddressBook());\n")]),_c('span',[_v("    return new CommandResult(MESSAGE_SUCCESS);\n")]),_c('span',[_v("}\n")])])])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_v("Example Usage: "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("clear")])])])}
},function anonymous(
) {
with(this){return _c('h4',{attrs:{"id":"developer-notes-3"}},[_v("Developer Notes"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#developer-notes-3","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_v("Safety Net: Confirmation is skipped in tests ("),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("requireConfirmation = false")]),_v(").")]),_v(" "),_c('li',[_v("Empty Check: Early return if the address book is already empty.")])])}
},function anonymous(
) {
with(this){return _c('p',[_v("When the user enters "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("clear")]),_v(", the command follows this sequence:")])}
},function anonymous(
) {
with(this){return _c('ol',[_c('li',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("LogicManager")]),_v(" calls the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("execute()")]),_v(" method of the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("ClearCommand")]),_v(".")]),_v(" "),_c('li',[_v("If the address book is already empty, a message is returned immediately.")]),_v(" "),_c('li',[_v("If confirmation is required, the UI invokes "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("ClearDialogUtil.showConfirmationDialog()")]),_v(".")]),_v(" "),_c('li',[_v("Upon confirmation, a new, empty "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("AddressBook")]),_v(" replaces the current one via "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("model.setAddressBook()")]),_v(".")]),_v(" "),_c('li',[_v("A "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("CommandResult")]),_v(" with a success message is returned.")])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"priority-command-implementation"}},[_v("Priority Command Implementation"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#priority-command-implementation","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('p',[_v("The "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("PriorityCommand")]),_v(" allows the nutritionist to update the priority level (e.g., HIGH, MEDIUM, LOW) of a selected patient from the filtered list. This command is helpful in identifying high-risk patients for urgent follow-up.")])}
},function anonymous(
) {
with(this){return _c('h4',{attrs:{"id":"key-command-implementation"}},[_v("Key Command Implementation"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#key-command-implementation","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_v("Updating Priority")])])}
},function anonymous(
) {
with(this){return _c('pre',[_c('code',{pre:true,attrs:{"class":"hljs"}},[_c('span',[_v("Person updatedPerson = new Person(\n")]),_c('span',[_v("    originalPerson.getName(),\n")]),_c('span',[_v("    originalPerson.getGender(),\n")]),_c('span',[_v("    // ... (other fields)\n")]),_c('span',[_v("    newPriority,  // Updated field\n")]),_c('span',[_v("    originalPerson.getMeetingDate(),\n")]),_c('span',[_v("    originalPerson.getAllergies()\n")]),_c('span',[_v(");\n")])])])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_v("Example usage: "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("priority 2 pr/high")])])])}
},function anonymous(
) {
with(this){return _c('h4',{attrs:{"id":"developer-notes-4"}},[_v("Developer Notes"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#developer-notes-4","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_v("Shortcut: pr/ can be used instead of priority.")])])}
},function anonymous(
) {
with(this){return _c('p',[_v("When a user issues a command such as "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("priority 2 pr/HIGH")]),_v(", the following sequence of operations occurs:")])}
},function anonymous(
) {
with(this){return _c('ol',[_c('li',[_v("The input is parsed by "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("PriorityCommandParser")]),_v(", which creates a "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("PriorityCommand")]),_v(" object.")]),_v(" "),_c('li',[_v("The "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("LogicManager")]),_v(" receives the command and calls its "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("execute(Model model)")]),_v(" method.")]),_v(" "),_c('li',[_v("Inside "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("PriorityCommand#execute()")]),_v(", the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Model")]),_v(" is queried for the current filtered list of persons.")]),_v(" "),_c('li',[_v("The patient at the specified index is retrieved and a new "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Person")]),_v(" object is created with the updated "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Priority")]),_v(".")]),_v(" "),_c('li',[_v("The "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Model#setPerson()")]),_v(" method replaces the original person with the updated one in the internal list.")]),_v(" "),_c('li',[_v("A "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("CommandResult")]),_v(" is returned with a success message.")])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"sort-command-implementation"}},[_v("Sort Command Implementation"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#sort-command-implementation","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('p',[_v("The sequence below illustrates the interactions within the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Logic")]),_v(" component, taking "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("execute(\"sort priority\")")]),_v(" call as an example.")])}
},function anonymous(
) {
with(this){return _c('h4',{attrs:{"id":"key-code-snippets-4"}},[_v("Key Code Snippets"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#key-code-snippets-4","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_v("Comparator Logic (Priority-first, then name):")])])}
},function anonymous(
) {
with(this){return _c('pre',[_c('code',{pre:true,attrs:{"class":"hljs"}},[_c('span',[_v("Comparator<Person> comparator = Comparator\n")]),_c('span',[_v("    .comparing((Person p) -> p.getPriority().getValue().ordinal()).reversed()\n")]),_c('span',[_v("    .thenComparing(p -> p.getName().toString().toLowerCase());\n")])])])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_v("Example usage: "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("sort priority")])])])}
},function anonymous(
) {
with(this){return _c('h4',{attrs:{"id":"developer-notes-5"}},[_v("Developer Notes"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#developer-notes-5","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_v("Extensibility: New sort criteria can be added by extending the switch block.")])])}
},function anonymous(
) {
with(this){return _c('p',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("SortCommand")]),_v(" behaviour:")])}
},function anonymous(
) {
with(this){return _c('ol',[_c('li',[_v("When the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("LogicManager")]),_v(" is called to execute the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("sort priority")]),_v(" command, it first delegates the parsing to "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("AddressBookParser")]),_v(".")]),_v(" "),_c('li',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("AddressBookParser")]),_v(" recognises the command type and uses "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("SortCommandParser")]),_v(" to interpret the command arguments.")]),_v(" "),_c('li',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("SortCommandParser")]),_v(" creates a new  "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("SortCommand")]),_v(" object with the given sort type ("),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("priority")]),_v(").")]),_v(" "),_c('li',[_v("The constructed "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("SortCommand")]),_v(" is returned to "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("LogicManager")]),_v(", which then calls its "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("execute()")]),_v(" method.")]),_v(" "),_c('li',[_v("Within "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("execute()")]),_v(", "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("SortCommand")]),_v(" invoked "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("model.sortFilteredPersonList(comparator)")]),_v(" to sort the current patient list based on the specified criterion.")]),_v(" "),_c('li',[_v("A "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("CommandResult")]),_v(" object is created to encapsulate the success message and is returned up the call stack to the UI.")])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"filter-command-implementation"}},[_v("Filter Command Implementation"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#filter-command-implementation","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('p',[_v("The sequence diagram below illustrates the interactions within the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Logic")]),_v(" component, taking "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("execute(\"filter d/low fat\")")]),_v(" call as an example.")])}
},function anonymous(
) {
with(this){return _c('h4',{attrs:{"id":"key-code-snippets-5"}},[_v("Key Code Snippets"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#key-code-snippets-5","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_v("Predicate Construction (Dynamic filtering):")])])}
},function anonymous(
) {
with(this){return _c('pre',[_c('code',{pre:true,attrs:{"class":"hljs"}},[_c('span',[_v("Predicate<Person> filterPredicate = switch (prefix) {\n")]),_c('span',[_v("    case \"d\" -> person -> person.getDiet().toString().equalsIgnoreCase(value);\n")]),_c('span',[_v("    case \"g\" -> person -> person.getGender().toString().equalsIgnoreCase(value);\n")]),_c('span',[_v("    // ... (other cases)\n")]),_c('span',[_v("};\n")])])])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_v("Example usage: "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("filter d/vegan")])])])}
},function anonymous(
) {
with(this){return _c('h4',{attrs:{"id":"developer-notes-6"}},[_v("Developer Notes"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#developer-notes-6","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_v("Case Insensitivity: Filters are case-insensitive (e.g., d/vegan matches Vegan).")])])}
},function anonymous(
) {
with(this){return _c('p',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("FilterCommand")]),_v(" behaviour:")])}
},function anonymous(
) {
with(this){return _c('ol',[_c('li',[_v("When the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("LogicManager")]),_v(" receives the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("filter d/low fat")]),_v(" command, it calls "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("AddressBookParser")]),_v(" to parse the command.")]),_v(" "),_c('li',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("AddressBookParser")]),_v(" recognises that it is a "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("filter")]),_v(" command and passes control to "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("FilterCommandParser")]),_v(".")]),_v(" "),_c('li',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("FilterCommandParser")]),_v(" splits the input into the prefix ("),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("d")]),_v(") and the value ("),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("low fat")]),_v("), then constructs a "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("FilterCommand")]),_v(" object with the parsed arguments.")]),_v(" "),_c('li',[_v("The "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("FilterCommand")]),_v(" is returned to the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("LogicManager")]),_v(", which proceeds to execute it.")]),_v(" "),_c('li',[_v("The "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("FilterCommand")]),_v(" builds a predicate using the prefix and value, and applies it through "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("model.updateFilteredPersonList(predicate)")]),_v(".")]),_v(" "),_c('li',[_v("A "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("CommandResult")]),_v(" containing the result message is returned to the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("LogicManager")]),_v(", and subsequently to the UI.")])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"command-history-implementation"}},[_v("Command History Implementation"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#command-history-implementation","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_v("A list of commands (commandHistory).")]),_v(" "),_c('li',[_v("A pointer (currentIndex) to track navigation position.")])])}
},function anonymous(
) {
with(this){return _c('h4',{attrs:{"id":"key-code-snippets-6"}},[_v("Key Code Snippets"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#key-code-snippets-6","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_v("Storing Commands:")])])}
},function anonymous(
) {
with(this){return _c('pre',[_c('code',{pre:true,attrs:{"class":"hljs"}},[_c('span',[_v("public void addCommand(String command) {\n")]),_c('span',[_v("    commandHistory.add(command);\n")]),_c('span',[_v("    currentIndex = commandHistory.size(); // Reset pointer to end\n")]),_c('span',[_v("}\n")])])])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_v("Navigation:")])])}
},function anonymous(
) {
with(this){return _c('pre',[_c('code',{pre:true,attrs:{"class":"hljs"}},[_c('span',[_v("public String getPreviousCommand() {\n")]),_c('span',[_v("    if (currentIndex <= 0) return null;\n")]),_c('span',[_v("    currentIndex--;\n")]),_c('span',[_v("    return commandHistory.get(currentIndex);\n")]),_c('span',[_v("}\n")]),_c('span',[_v("\n")]),_c('span',[_v("public String getNextCommand() {\n")]),_c('span',[_v("    if (currentIndex >= commandHistory.size() - 1) return null;\n")]),_c('span',[_v("    currentIndex++;\n")]),_c('span',[_v("    return commandHistory.get(currentIndex);\n")]),_c('span',[_v("}\n")])])])}
},function anonymous(
) {
with(this){return _c('h4',{attrs:{"id":"developer-notes-7"}},[_v("Developer Notes"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#developer-notes-7","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_v("Pointer Reset: currentIndex resets to the end after each new command.")]),_v(" "),_c('li',[_v("Null Handling: Returns null when reaching history bounds (no-op in UI).")]),_v(" "),_c('li',[_v("Thread Safety: Not thread-safe; assumes single-threaded UI access.")])])}
},function anonymous(
) {
with(this){return _c('p',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("CommandHistory")]),_v(" behaviour:")])}
},function anonymous(
) {
with(this){return _c('ol',[_c('li',[_c('strong',[_v("User Interaction")]),_v(": The user inputs commands through the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("CommandBox")]),_v(" in the UI, which are captured and processed by the system.")]),_v(" "),_c('li',[_c('strong',[_v("Logic Processing")]),_v(": The "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("LogicManager")]),_v(" processes these commands using the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("AddressBookParser")]),_v(" to identify and execute the appropriate command, interacting with the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Model")]),_v(" as needed.")]),_v(" "),_c('li',[_c('strong',[_v("Command History")]),_v(": Each executed command is recorded in "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("CommandHistory")]),_v(", allowing users to navigate through past commands using the UP and DOWN arrow keys. This navigation updates the command input field, facilitating easy re-execution or modification of previous commands.")])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"undo-redo-command-implementation"}},[_v("Undo/redo Command Implementation"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#undo-redo-command-implementation","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('p',[_v("The undo/redo mechanism is facilitated by "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("VersionedAddressBook")]),_v(". It extends "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("AddressBook")]),_v(" with an undo/redo history, stored internally as an "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("addressBookStateList")]),_v(" and "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("currentStatePointer")]),_v(".")])}
},function anonymous(
) {
with(this){return _c('h4',{attrs:{"id":"key-code-snippets-7"}},[_v("Key Code Snippets"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#key-code-snippets-7","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_v("State Management (VersionedAddressBook):")])])}
},function anonymous(
) {
with(this){return _c('pre',[_c('code',{pre:true,attrs:{"class":"hljs"}},[_c('span',[_v("public void commit() {\n")]),_c('span',[_v("    // Purge future states if pointer is not at end\n")]),_c('span',[_v("    addressBookStateList.subList(currentStatePointer + 1, addressBookStateList.size()).clear();\n")]),_c('span',[_v("    addressBookStateList.add(new AddressBook(this));\n")]),_c('span',[_v("    currentStatePointer++;\n")]),_c('span',[_v("}\n")])])])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_v("Undo/Redo Execution:")])])}
},function anonymous(
) {
with(this){return _c('pre',[_c('code',{pre:true,attrs:{"class":"hljs"}},[_c('span',[_v("// UndoCommand.java\n")]),_c('span',[_v("public CommandResult execute(Model model) throws CommandException {\n")]),_c('span',[_v("    if (!model.canUndoAddressBook()) {\n")]),_c('span',[_v("        throw new CommandException(MESSAGE_FAILURE);\n")]),_c('span',[_v("    }\n")]),_c('span',[_v("    model.undoAddressBook();\n")]),_c('span',[_v("    return new CommandResult(MESSAGE_SUCCESS);\n")]),_c('span',[_v("}\n")]),_c('span',[_v("\n")]),_c('span',[_v("// RedoCommand.java (similar logic)\n")])])])}
},function anonymous(
) {
with(this){return _c('h4',{attrs:{"id":"developer-notes-8"}},[_v("Developer Notes"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#developer-notes-8","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_v("Immutable States: Each snapshot is a deep copy of AddressBook.")]),_v(" "),_c('li',[_v("Non-Modifying Commands: list, find, sort, help do not trigger commits.")]),_v(" "),_c('li',[_v("UI Sync: The UI refreshes automatically after undo/redo via Model observers.")])])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("VersionedAddressBook#commit()")]),_v(" — Saves the current address book state in its history.")]),_v(" "),_c('li',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("VersionedAddressBook#undo()")]),_v(" — Restores the previous address book state from its history.")]),_v(" "),_c('li',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("VersionedAddressBook#redo()")]),_v(" — Restores a previously undone address book state from its history.")])])}
},function anonymous(
) {
with(this){return _c('p',[_v("These operations are exposed in the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Model")]),_v(" interface as "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Model#commitAddressBook()")]),_v(", "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Model#undoAddressBook()")]),_v(" and "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Model#redoAddressBook()")]),_v(" respectively. Given below is an example usage scenario and how the undo/redo mechanism behaves at each step.")])}
},function anonymous(
) {
with(this){return _c('ol',[_c('li',[_v("The user launches the application for the first time. The "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("VersionedAddressBook")]),_v(" will be initialized with the initial address book state, and the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("currentStatePointer")]),_v(" pointing to that single address book state.")])])}
},function anonymous(
) {
with(this){return _c('ol',{attrs:{"start":"2"}},[_c('li',[_v("The user executes "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("delete 5")]),_v(" command to delete the 5th person in the address book. The "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("delete")]),_v(" command calls "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Model#commitAddressBook()")]),_v(", causing the modified state of the address book after the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("delete 5")]),_v(" command executes to be saved in the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("addressBookStateList")]),_v(", and the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("currentStatePointer")]),_v(" is shifted to the newly inserted address book state.")])])}
},function anonymous(
) {
with(this){return _c('ol',{attrs:{"start":"3"}},[_c('li',[_v("The user executes "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("add n/David …​")]),_v(" to add a new person. The "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("add")]),_v(" command also calls "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Model#commitAddressBook()")]),_v(", causing another modified address book state to be saved into the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("addressBookStateList")]),_v(".")])])}
},function anonymous(
) {
with(this){return _c('ol',{attrs:{"start":"4"}},[_c('li',[_v("The user now decides that adding the person was a mistake, and decides to undo that action by executing the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("undo")]),_v(" command. The "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("undo")]),_v(" command will call "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Model#undoAddressBook()")]),_v(", which will shift the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("currentStatePointer")]),_v(" once to the left, pointing it to the previous address book state, and restores the address book to that state.")])])}
},function anonymous(
) {
with(this){return _c('p',[_v("The following sequence diagram shows how an undo operation goes through the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Logic")]),_v(" component:")])}
},function anonymous(
) {
with(this){return _c('p',[_v("Similarly, how an undo operation goes through the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Model")]),_v(" component is shown below:")])}
},function anonymous(
) {
with(this){return _c('p',[_v("The "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("redo")]),_v(" command does the opposite — it calls "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Model#redoAddressBook()")]),_v(", which shifts the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("currentStatePointer")]),_v(" once to the right, pointing to the previously undone state, and restores the address book to that state.")])}
},function anonymous(
) {
with(this){return _c('ol',{attrs:{"start":"5"}},[_c('li',[_v("The user then decides to execute the command "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("list")]),_v(". Commands that do not modify the address book, such as "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("list")]),_v(", will usually not call "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Model#commitAddressBook()")]),_v(", "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Model#undoAddressBook()")]),_v(" or "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Model#redoAddressBook()")]),_v(". Thus, the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("addressBookStateList")]),_v(" remains unchanged.")])])}
},function anonymous(
) {
with(this){return _c('ol',{attrs:{"start":"6"}},[_c('li',[_v("The user executes "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("clear")]),_v(", which calls "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Model#commitAddressBook()")]),_v(". Since the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("currentStatePointer")]),_v(" is not pointing at the end of the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("addressBookStateList")]),_v(", all address book states after the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("currentStatePointer")]),_v(" will be purged. Reason: It no longer makes sense to redo the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("add n/David …​")]),_v(" command. This is the behavior that most modern desktop applications follow.")])])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_c('strong',[_v("State Purge:")]),_v(" Executing a new command after an undo will purge the redo history. Only relevant states are restorable.")])])}
},function anonymous(
) {
with(this){return _c('h2',{attrs:{"id":"edge-cases"}},[_v("Edge Cases"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#edge-cases","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"command-specific-edge-cases"}},[_v("Command-Specific Edge Cases"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#command-specific-edge-cases","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("Command")]),_v(" "),_c('th',[_v("Edge Case")]),_v(" "),_c('th',[_v("System Response")]),_v(" "),_c('th',[_v("Handling Mechanism")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_c('strong',[_v("Add")])]),_v(" "),_c('td',[_v("Duplicate patient (same name + phone)")]),_v(" "),_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("\"This person already exists in VitaBook\"")])]),_v(" "),_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("AddCommand#execute()")]),_v(" checks "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("model.hasPerson()")])])]),_v(" "),_c('tr',[_c('td'),_v(" "),_c('td',[_v("Missing required fields (e.g., no "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("n/NAME")]),_v(")")]),_v(" "),_c('td',[_v("Shows "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("MESSAGE_USAGE")]),_v(" with format")]),_v(" "),_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("AddCommandParser")]),_v(" validates prefixes")])]),_v(" "),_c('tr',[_c('td'),_v(" "),_c('td',[_v("Invalid field format (e.g., "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("h/abc")]),_v(")")]),_v(" "),_c('td',[_v("Field-specific error (e.g., "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("\"Height must be a number\"")]),_v(")")]),_v(" "),_c('td',[_v("Field class constructors validate input")])]),_v(" "),_c('tr',[_c('td',[_c('strong',[_v("Edit")])]),_v(" "),_c('td',[_v("Invalid index (e.g., "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("edit 999")]),_v(")")]),_v(" "),_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("\"The patient index provided is invalid\"")])]),_v(" "),_c('td',[_v("Checks "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("index.getZeroBased() >= list.size()")])])]),_v(" "),_c('tr',[_c('td'),_v(" "),_c('td',[_v("No fields edited")]),_v(" "),_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("\"At least one field to edit must be provided\"")])]),_v(" "),_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("EditPersonDescriptor#isAnyFieldEdited()")])])]),_v(" "),_c('tr',[_c('td'),_v(" "),_c('td',[_v("Duplicate after edit")]),_v(" "),_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("\"This patient already exists\"")])]),_v(" "),_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("model.hasPerson()")]),_v(" check")])]),_v(" "),_c('tr',[_c('td',[_c('strong',[_v("Clear")])]),_v(" "),_c('td',[_v("Empty address book")]),_v(" "),_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("\"Nothing on list!\"")])]),_v(" "),_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("model.getAddressBook().isEmpty()")]),_v(" check")])]),_v(" "),_c('tr',[_c('td'),_v(" "),_c('td',[_v("User cancels confirmation")]),_v(" "),_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("\"Clear command cancelled.\"")])]),_v(" "),_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("ClearDialogUtil.showConfirmationDialog()")])])]),_v(" "),_c('tr',[_c('td',[_c('strong',[_v("Priority")])]),_v(" "),_c('td',[_v("Invalid priority value (e.g., "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("pr/INVALID")]),_v(")")]),_v(" "),_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("\"Priority must be low, medium, or high\"")])]),_v(" "),_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Priority")]),_v(" enum validation")])]),_v(" "),_c('tr',[_c('td'),_v(" "),_c('td',[_v("Invalid index")]),_v(" "),_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("\"Invalid patient index.\"")])]),_v(" "),_c('td',[_v("Index bounds check")])]),_v(" "),_c('tr',[_c('td',[_c('strong',[_v("Sort")])]),_v(" "),_c('td',[_v("Invalid sort type (e.g., "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("sort invalid")]),_v(")")]),_v(" "),_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("\"Invalid sort type. Use: priority/name/diet\"")])]),_v(" "),_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("switch")]),_v(" default case throws error")])]),_v(" "),_c('tr',[_c('td'),_v(" "),_c('td',[_v("Empty list")]),_v(" "),_c('td',[_v("Silent (no action)")]),_v(" "),_c('td',[_v("Implicit in sorting logic")])]),_v(" "),_c('tr',[_c('td',[_c('strong',[_v("Filter")])]),_v(" "),_c('td',[_v("Invalid prefix (e.g., "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("filter x/abc")]),_v(")")]),_v(" "),_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("\"Unexpected error: invalid filter prefix\"")])]),_v(" "),_c('td',[_v("Default "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("switch")]),_v(" case")])]),_v(" "),_c('tr',[_c('td'),_v(" "),_c('td',[_v("No matches")]),_v(" "),_c('td',[_v("Empty list (no error)")]),_v(" "),_c('td',[_v("Predicate returns "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("false")]),_v(" for all")])]),_v(" "),_c('tr',[_c('td',[_c('strong',[_v("Undo/Redo")])]),_v(" "),_c('td',[_v("Undo at initial state")]),_v(" "),_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("\"No previous state to undo\"")])]),_v(" "),_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("model.canUndoAddressBook()")]),_v(" check")])]),_v(" "),_c('tr',[_c('td'),_v(" "),_c('td',[_v("Redo at latest state")]),_v(" "),_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("\"No next state to redo\"")])]),_v(" "),_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("model.canRedoAddressBook()")]),_v(" check")])]),_v(" "),_c('tr',[_c('td'),_v(" "),_c('td',[_v("Non-modifying command (e.g., "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("list")]),_v(")")]),_v(" "),_c('td',[_v("No state change")]),_v(" "),_c('td',[_v("Skips "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Model#commitAddressBook()")])])]),_v(" "),_c('tr',[_c('td'),_v(" "),_c('td',[_v("Executing a new command after an undo")]),_v(" "),_c('td',[_v("Purges the redo history")]),_v(" "),_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("VersionedAddressBook#commit()")])])])])])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"general-edge-cases"}},[_v("General Edge Cases"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#general-edge-cases","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("Scenario")]),_v(" "),_c('th',[_v("System Response")]),_v(" "),_c('th',[_v("Handling Mechanism")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_c('strong',[_v("Incorrect Command Format")])]),_v(" "),_c('td',[_v("Shows command-specific "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("MESSAGE_USAGE")])]),_v(" "),_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("*CommandParser")]),_v(" classes validate syntax")])]),_v(" "),_c('tr',[_c('td',[_c('strong',[_v("Empty Input")])]),_v(" "),_c('td',[_v("Displays help menu")]),_v(" "),_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("ParserUtil")]),_v(" checks for empty strings")])]),_v(" "),_c('tr',[_c('td',[_c('strong',[_v("File Corruption")])]),_v(" "),_c('td',[_v("Creates new empty data file")]),_v(" "),_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Storage")]),_v(" class handles IO exceptions")])]),_v(" "),_c('tr',[_c('td',[_c('strong',[_v("Keyboard Interrupt")])]),_v(" "),_c('td',[_v("Returns to command prompt")]),_v(" "),_c('td',[_v("CLI main loop catches "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Ctrl+C")])])])])])])}
},function anonymous(
) {
with(this){return _c('h2',{attrs:{"id":"documentation-logging-testing-configuration-dev-ops"}},[_c('strong',[_v("Documentation, logging, testing, configuration, dev-ops")]),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#documentation-logging-testing-configuration-dev-ops","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_c('a',{attrs:{"href":"/tp/Documentation.html"}},[_v("Documentation guide")])]),_v(" "),_c('li',[_c('a',{attrs:{"href":"/tp/Testing.html"}},[_v("Testing guide")])]),_v(" "),_c('li',[_c('a',{attrs:{"href":"/tp/Logging.html"}},[_v("Logging guide")])]),_v(" "),_c('li',[_c('a',{attrs:{"href":"/tp/Configuration.html"}},[_v("Configuration guide")])]),_v(" "),_c('li',[_c('a',{attrs:{"href":"/tp/DevOps.html"}},[_v("DevOps guide")])])])}
},function anonymous(
) {
with(this){return _c('h2',{attrs:{"id":"appendix-requirements"}},[_c('strong',[_v("Appendix: Requirements")]),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#appendix-requirements","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"product-scope"}},[_v("Product scope"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#product-scope","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_v("Target user profile")]),_v(":")])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_v("Role: Works as a freelance nutritionist, often visiting multiple patients daily")]),_v(" "),_c('li',[_v("Needs:\n"),_c('ul',[_c('li',[_v("Has a need to manage a significant number of patient profiles, including patient information, medical history, dietary restrictions, and follow-ups")]),_v(" "),_c('li',[_v("CLI-first workflow for speed (typing > GUI interactions).")]),_v(" "),_c('li',[_v("Portability: No installation needed; works on any OS with Java 17+.")])])]),_v(" "),_c('li',[_v("Pain Points:\n"),_c('ul',[_c('li',[_v("Time wasted on manual data entry in traditional GUI apps.")]),_v(" "),_c('li',[_v("Difficulty tracking patient updates across devices.")])])])])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_v("Value Proposition")]),_v(":")])}
},function anonymous(
) {
with(this){return _c('p',[_v("VitaBook is a "),_c('strong',[_v("command-line interface (CLI) application")]),_v(" designed for freelance nutritionists who need to manage patient profiles efficiently. It offers:")])}
},function anonymous(
) {
with(this){return _c('ul',[_c('li',[_c('strong',[_v("Speed")]),_v(": Perform tasks 3x faster than GUI apps with keyboard-only commands (e.g., add a patient in under 10 seconds).")]),_v(" "),_c('li',[_c('strong',[_v("Organization")]),_v(": Filter/sort patients by diet, priority, or allergies with simple commands (e.g., "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("filter d/vegan")]),_v(").")]),_v(" "),_c('li',[_c('strong',[_v("Portability")]),_v(": Runs on any OS (Windows/macOS/Linux) with Java 17+—no installation needed. Just launch the JAR file.")]),_v(" "),_c('li',[_c('strong',[_v("Data Control")]),_v(": Human-editable JSON storage for easy backups and manual edits.")])])}
},function anonymous(
) {
with(this){return _c('blockquote',[_c('p',[_c('em',[_v("\"VitaBook cuts patient management time by 50%, letting you focus on care—not paperwork.\"")])])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"user-stories"}},[_v("User stories"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#user-stories","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_c('strong',[_v("As a …")])]),_v(" "),_c('th',[_c('strong',[_v("I want to …")])]),_v(" "),_c('th',[_c('strong',[_v("So that I can…")])]),_v(" "),_c('th',[_c('strong',[_v("Notes")])])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_v("Busy Nutritionist")]),_v(" "),_c('td',[_v("Search for a patient by name")]),_v(" "),_c('td',[_v("Quickly access relevant dietary information")]),_v(" "),_c('td',[_v("Search results should be fast and accurate.")])]),_v(" "),_c('tr',[_c('td',[_v("Busy Nutritionist")]),_v(" "),_c('td',[_v("Add tags to classify my patients easily")]),_v(" "),_c('td',[_v("Easily filter and find the relevant patients")]),_v(" "),_c('td',[_v("Allow for multiple tags per patient. The system should allow filtering based on tags.")])]),_v(" "),_c('tr',[_c('td',[_v("Busy Nutritionist")]),_v(" "),_c('td',[_v("Undo my last action when using the application")]),_v(" "),_c('td',[_v("Easily revert to the original state in the event of mistakes or change of plans")]),_v(" "),_c('td',[_v("Limits to actions that modify data only.")])]),_v(" "),_c('tr',[_c('td',[_v("Busy Nutritionist")]),_v(" "),_c('td',[_v("Schedule Follow-up Appointment")]),_v(" "),_c('td',[_v("See and review patient’s status after an appropriate time")]),_v(" "),_c('td')]),_v(" "),_c('tr',[_c('td',[_v("Busy Nutritionist")]),_v(" "),_c('td',[_v("Set reminders for follow-up appointments")]),_v(" "),_c('td',[_v("Not forget important patient visits")]),_v(" "),_c('td',[_v("Notifications should appear on a dashboard.")])]),_v(" "),_c('tr',[_c('td',[_v("Busy Nutritionist")]),_v(" "),_c('td',[_v("Receive notifications about patient dietary updates")]),_v(" "),_c('td',[_v("Stay informed")]),_v(" "),_c('td',[_v("Push/email notifications should be configurable.")])]),_v(" "),_c('tr',[_c('td',[_v("Elderly Nutritionist")]),_v(" "),_c('td',[_v("Enable high-contrast colors")]),_v(" "),_c('td',[_v("Easily read and navigate the app")]),_v(" "),_c('td',[_v("A toggle option for high contrast should be available in settings.")])]),_v(" "),_c('tr',[_c('td',[_v("Elderly Nutritionist")]),_v(" "),_c('td',[_v("Increase the font size")]),_v(" "),_c('td',[_v("Read text comfortably")]),_v(" "),_c('td',[_v("Font size settings should be adjustable in the UI.")])]),_v(" "),_c('tr',[_c('td',[_v("First-Time Nutritionist")]),_v(" "),_c('td',[_v("Ensure no duplicates in the patient’s information are added")]),_v(" "),_c('td',[_v("Refer to the correct information and make necessary changes")]),_v(" "),_c('td',[_v("Alert the user of possible duplication when adding a new patient.")])]),_v(" "),_c('tr',[_c('td',[_v("First-Time Nutritionist")]),_v(" "),_c('td',[_v("Access the application’s help function")]),_v(" "),_c('td',[_v("Learn how to use the application effectively")]),_v(" "),_c('td',[_v("List down all available commands that the user can use.")])]),_v(" "),_c('tr',[_c('td',[_v("First-Time Nutritionist")]),_v(" "),_c('td',[_v("See some sample patients when I open the app")]),_v(" "),_c('td',[_v("Easily try out its features without needing to add my data first")]),_v(" "),_c('td')]),_v(" "),_c('tr',[_c('td',[_v("Nutritionist")]),_v(" "),_c('td',[_v("Add new patients to the system")]),_v(" "),_c('td',[_v("Maintain an updated record of my clients")]),_v(" "),_c('td',[_v("Each new patient should have a unique profile.")])]),_v(" "),_c('tr',[_c('td',[_v("Nutritionist")]),_v(" "),_c('td',[_v("Delete patient records")]),_v(" "),_c('td',[_v("Remove outdated or irrelevant data")]),_v(" "),_c('td',[_v("A confirmation prompt should appear before deletion.")])]),_v(" "),_c('tr',[_c('td',[_v("Nutritionist")]),_v(" "),_c('td',[_v("Clear all data in the application")]),_v(" "),_c('td',[_v("Reset the application when necessary")]),_v(" "),_c('td',[_v("Requires confirmation to prevent accidental reset.")])]),_v(" "),_c('tr',[_c('td',[_v("Nutritionist")]),_v(" "),_c('td',[_v("Filter patients based on dietary conditions")]),_v(" "),_c('td',[_v("Group similar cases")]),_v(" "),_c('td',[_v("Filters should be easy to apply and reset.")])]),_v(" "),_c('tr',[_c('td',[_v("Nutritionist")]),_v(" "),_c('td',[_v("Edit/Update patient information")]),_v(" "),_c('td',[_v("Keep records accurate")]),_v(" "),_c('td',[_v("Changes should be logged with timestamps.")])]),_v(" "),_c('tr',[_c('td',[_v("Nutritionist")]),_v(" "),_c('td',[_v("View a patient's information")]),_v(" "),_c('td',[_v("Make informed dietary recommendations")]),_v(" "),_c('td',[_v("Medical history should be displayed clearly and concisely. Allergies should be highlighted.")])]),_v(" "),_c('tr',[_c('td',[_v("Nutritionist")]),_v(" "),_c('td',[_v("Archive patients that no longer require visits")]),_v(" "),_c('td',[_v("Keep track of their information, yet not clutter up the address book")]),_v(" "),_c('td',[_v("Able to retrieve archived information easily when needed.")])]),_v(" "),_c('tr',[_c('td',[_v("Nutritionist")]),_v(" "),_c('td',[_v("Upload and attach files to patient profiles")]),_v(" "),_c('td',[_v("Have all relevant data in one place")]),_v(" "),_c('td',[_v("Users should be able to upload PDFs, images, and other common file types.")])]),_v(" "),_c('tr',[_c('td',[_v("Nutritionist")]),_v(" "),_c('td',[_v("Sort patients based on name")]),_v(" "),_c('td',[_v("Find patients at a glance")]),_v(" "),_c('td',[_v("Sorting options can allow easy finding of patients.")])]),_v(" "),_c('tr',[_c('td',[_v("Nutritionist")]),_v(" "),_c('td',[_v("Mark high-risk patients")]),_v(" "),_c('td',[_v("Quickly identify those needing urgent attention")]),_v(" "),_c('td',[_v("High-risk patients should be visually highlighted.")])]),_v(" "),_c('tr',[_c('td',[_v("Nutritionist")]),_v(" "),_c('td',[_v("Add emergency contacts to a patient profile")]),_v(" "),_c('td',[_v("Contact them in urgent situations")]),_v(" "),_c('td',[_v("Emergency contacts should be stored and easily accessible.")])]),_v(" "),_c('tr',[_c('td',[_v("Nutritionist")]),_v(" "),_c('td',[_v("Add custom notes to a patient’s profile")]),_v(" "),_c('td',[_v("Track observations over time")]),_v(" "),_c('td',[_v("Notes should be editable and timestamped.")])])])])])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("As a …")]),_v(" "),_c('th',[_v("I want to …")]),_v(" "),_c('th',[_v("So that I can…")]),_v(" "),_c('th',[_v("Notes")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_v("Nutritionist")]),_v(" "),_c('td',[_v("View a patient's medical history, food allergies, and dietary restrictions")]),_v(" "),_c('td',[_v("Make informed dietary recommendations")]),_v(" "),_c('td',[_v("Medical history should be displayed clearly and concisely. Allergies should be highlighted in the profile.")])]),_v(" "),_c('tr',[_c('td',[_v("Nutritionist")]),_v(" "),_c('td',[_v("Add new patients to the system")]),_v(" "),_c('td',[_v("Maintain an updated record of my clients")]),_v(" "),_c('td',[_v("Each new patient should have a unique profile.")])]),_v(" "),_c('tr',[_c('td',[_v("Nutritionist")]),_v(" "),_c('td',[_v("Delete patient records")]),_v(" "),_c('td',[_v("Remove outdated or irrelevant data")]),_v(" "),_c('td',[_v("A confirmation prompt should appear before deletion.")])])])])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"use-cases"}},[_v("Use cases"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#use-cases","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('p',[_v("(For all use cases below, the "),_c('strong',[_v("System")]),_v(" is the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("VitaBook")]),_v(" and the "),_c('strong',[_v("Actor")]),_v(" is the "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Nutritionist (user)")]),_v(", unless specified otherwise)")])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_v("Use Case: UC01 - Add Patient")])])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_v("MSS:")])])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("No.")]),_v(" "),_c('th',[_v("MSS")]),_v(" "),_c('th',[_v("Extensions")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_v("1")]),_v(" "),_c('td',[_v("Nutritionist decides to register a new patient in VitaBook.")]),_v(" "),_c('td',[_v("N.A.")])]),_v(" "),_c('tr',[_c('td',[_v("2")]),_v(" "),_c('td',[_v("Nutritionist types the add command followed by all required patient details in the specified format.")]),_v(" "),_c('td',[_v("N.A.")])]),_v(" "),_c('tr',[_c('td',[_v("3")]),_v(" "),_c('td',[_v("VitaBook checks that all fields (name, gender, height, weight, phone, email, address, diet, priority, meeting date) are present and correctly formatted.")]),_v(" "),_c('td',[_v("One or more fields are invalid or missing."),_c('br'),_v("  (a) VitaBook displays an error message specifying the field(s) that need correction."),_c('br'),_v("  (b) Nutritionist retypes the command with corrected input.")])]),_v(" "),_c('tr',[_c('td',[_v("4")]),_v(" "),_c('td',[_v("VitaBook checks that the email is unique.")]),_v(" "),_c('td',[_v("A patient with the same email already exists."),_c('br'),_v("  (a) VitaBook rejects the addition and displays a duplicate email error."),_c('br'),_v("  (b) Nutritionist provides a different email. Use case resumes from step 3.")])]),_v(" "),_c('tr',[_c('td',[_v("5")]),_v(" "),_c('td',[_v("VitaBook adds the new patient to the system.")]),_v(" "),_c('td',[_v("N.A.")])]),_v(" "),_c('tr',[_c('td',[_v("6")]),_v(" "),_c('td',[_v("VitaBook displays a success message with the newly added patient’s summary. Use case ends.")]),_v(" "),_c('td',[_v("N.A.")])])])])])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_v("Use Case: UC02 - List Patients")])])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_v("MSS:")])])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("No.")]),_v(" "),_c('th',[_v("MSS")]),_v(" "),_c('th',[_v("Extensions")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_v("1")]),_v(" "),_c('td',[_v("Nutritionist wants to view all registered patients.")]),_v(" "),_c('td',[_v("N.A.")])]),_v(" "),_c('tr',[_c('td',[_v("2")]),_v(" "),_c('td',[_v("Nutritionist types the list command.")]),_v(" "),_c('td',[_v("N.A.")])]),_v(" "),_c('tr',[_c('td',[_v("3")]),_v(" "),_c('td',[_v("VitaBook displays the complete list of patients, ordered by the order of entry. Use case ends.")]),_v(" "),_c('td',[_v("N.A.")])])])])])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_v("Use Case: UC03 - Edit Patient")])])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_v("MSS:")])])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("No.")]),_v(" "),_c('th',[_v("MSS")]),_v(" "),_c('th',[_v("Extensions")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_v("1")]),_v(" "),_c('td',[_v("Nutritionist identifies a patient whose details need updating.")]),_v(" "),_c('td',[_v("N.A.")])]),_v(" "),_c('tr',[_c('td',[_v("2")]),_v(" "),_c('td',[_v("Nutritionist types the edit command followed by the patient's index and the updated fields.")]),_v(" "),_c('td',[_v("No fields are provided to update."),_c('br'),_v("  (a) VitaBook displays an error indicating at least one field is required.")])]),_v(" "),_c('tr',[_c('td',[_v("3")]),_v(" "),_c('td',[_v("VitaBook validates the index and ensures the patient exists.")]),_v(" "),_c('td',[_v("Index is invalid."),_c('br'),_v("  (a) VitaBook displays an index error message."),_c('br'),_v("  (b) Nutritionist re-enters the command with a valid index.")])]),_v(" "),_c('tr',[_c('td',[_v("4")]),_v(" "),_c('td',[_v("VitaBook validates all provided input fields.")]),_v(" "),_c('td',[_v("A field contains invalid data."),_c('br'),_v("  (a) VitaBook displays specific validation errors."),_c('br'),_v("  (b) Nutritionist corrects and retypes the command.")])]),_v(" "),_c('tr',[_c('td',[_v("5")]),_v(" "),_c('td',[_v("VitaBook updates the patient information accordingly.")]),_v(" "),_c('td',[_v("N.A.")])]),_v(" "),_c('tr',[_c('td',[_v("6")]),_v(" "),_c('td',[_v("VitaBook displays a confirmation message with updated details. Use case ends.")]),_v(" "),_c('td',[_v("N.A.")])])])])])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_v("Use Case: UC04 - Add or Update Remark")])])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_v("MSS:")])])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("No.")]),_v(" "),_c('th',[_v("MSS")]),_v(" "),_c('th',[_v("Extensions")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_v("1")]),_v(" "),_c('td',[_v("Nutritionist wants to add or update a note about a patient’s condition or behavior.")]),_v(" "),_c('td',[_v("N.A.")])]),_v(" "),_c('tr',[_c('td',[_v("2")]),_v(" "),_c('td',[_v("Nutritionist enters the remark command followed by the index of the patient and the remark content.")]),_v(" "),_c('td',[_v("No remark content is provided."),_c('br'),_v("  (a) VitaBook clears the existing re mark and confirms the update.")])]),_v(" "),_c('tr',[_c('td',[_v("3")]),_v(" "),_c('td',[_v("VitaBook validates the index.")]),_v(" "),_c('td',[_v("Index is invalid."),_c('br'),_v("  (a) VitaBook displays an error."),_c('br'),_v("  (b) Nutritionist corrects the index.")])]),_v(" "),_c('tr',[_c('td',[_v("4")]),_v(" "),_c('td',[_v("VitaBook updates or adds the remark for the patient.")]),_v(" "),_c('td',[_v("N.A.")])]),_v(" "),_c('tr',[_c('td',[_v("5")]),_v(" "),_c('td',[_v("VitaBook displays a success message. Use case ends.")]),_v(" "),_c('td',[_v("N.A.")])])])])])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_v("Use Case: UC05 - Change Patient Priority")])])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_v("MSS:")])])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("No.")]),_v(" "),_c('th',[_v("MSS")]),_v(" "),_c('th',[_v("Extensions")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_v("1")]),_v(" "),_c('td',[_v("Nutritionist reviews a patient’s condition and decides their priority level needs updating.")]),_v(" "),_c('td',[_v("N.A.")])]),_v(" "),_c('tr',[_c('td',[_v("2")]),_v(" "),_c('td',[_v("Nutritionist types the pr command with the patient index and new priority (high, medium, or low).")]),_v(" "),_c('td',[_v("Invalid index."),_c('br'),_v("  (a) VitaBook displays an error."),_c('br'),_v("  (b) Nutritionist retypes the command.")])]),_v(" "),_c('tr',[_c('td',[_v("3")]),_v(" "),_c('td',[_v("VitaBook validates the index and new priority value.")]),_v(" "),_c('td',[_v("Priority value is not among allowed options."),_c('br'),_v("  (a) VitaBook displays constraint error."),_c('br'),_v("  (b) Nutritionist retries with a valid priority.")])]),_v(" "),_c('tr',[_c('td',[_v("4")]),_v(" "),_c('td',[_v("VitaBook updates the patient’s priority.")]),_v(" "),_c('td',[_v("N.A.")])]),_v(" "),_c('tr',[_c('td',[_v("5")]),_v(" "),_c('td',[_v("VitaBook displays a confirmation message. Use case ends.")]),_v(" "),_c('td',[_v("N.A.")])])])])])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_v("Use Case: UC06 - Find Patient by Name")])])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_v("MSS:")])])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("No.")]),_v(" "),_c('th',[_v("MSS")]),_v(" "),_c('th',[_v("Extensions")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_v("1")]),_v(" "),_c('td',[_v("Nutritionist wants to find a patient based on their name.")]),_v(" "),_c('td',[_v("N.A.")])]),_v(" "),_c('tr',[_c('td',[_v("2")]),_v(" "),_c('td',[_v("Nutritionist types the find command followed by one or more keywords.")]),_v(" "),_c('td',[_v("No patients match the search."),_c('br'),_v("  (a) VitaBook displays an empty result message.")])]),_v(" "),_c('tr',[_c('td',[_v("3")]),_v(" "),_c('td',[_v("VitaBook performs a case-insensitive search in the name fields.")]),_v(" "),_c('td',[_v("N.A.")])]),_v(" "),_c('tr',[_c('td',[_v("4")]),_v(" "),_c('td',[_v("VitaBook displays a list of matching patients. Use case ends.")]),_v(" "),_c('td',[_v("N.A.")])])])])])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_v("Use Case: UC07 - Filter Patients")])])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_v("MSS:")])])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("No.")]),_v(" "),_c('th',[_v("MSS")]),_v(" "),_c('th',[_v("Extensions")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_v("1")]),_v(" "),_c('td',[_v("Nutritionist wants to view patients by a specific criterion (e.g. diet, gender).")]),_v(" "),_c('td',[_v("N.A.")])]),_v(" "),_c('tr',[_c('td',[_v("2")]),_v(" "),_c('td',[_v("Nutritionist types the filter command followed by a valid prefix and value (e.g. d/low sugar).")]),_v(" "),_c('td',[_v("The filter prefix is invalid."),_c('br'),_v("  (a) VitaBook displays an error message with correct format.")])]),_v(" "),_c('tr',[_c('td',[_v("3")]),_v(" "),_c('td',[_v("VitaBook applies the filter and displays matching patients. Use case ends.")]),_v(" "),_c('td',[_v("No patients match the filter."),_c('br'),_v("  (a) VitaBook displays an empty list message.")])])])])])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_v("Use Case: UC08 - Sort Patients")])])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_v("MSS:")])])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("No.")]),_v(" "),_c('th',[_v("MSS")]),_v(" "),_c('th',[_v("Extensions")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_v("1")]),_v(" "),_c('td',[_v("Nutritionist wants to organize patients by a particular field (e.g. name).")]),_v(" "),_c('td',[_v("N.A.")])]),_v(" "),_c('tr',[_c('td',[_v("2")]),_v(" "),_c('td',[_v("Nutritionist types the sort command with the desired field (e.g. sort name).")]),_v(" "),_c('td',[_v("Field specified is invalid."),_c('br'),_v("  (a) VitaBook shows a list of valid fields and an error message.")])]),_v(" "),_c('tr',[_c('td',[_v("3")]),_v(" "),_c('td',[_v("VitaBook sorts the patient list based on the chosen field.")]),_v(" "),_c('td',[_v("N.A.")])]),_v(" "),_c('tr',[_c('td',[_v("3")]),_v(" "),_c('td',[_v("VitaBook displays the sorted list. Use case ends.")]),_v(" "),_c('td',[_v("N.A.")])])])])])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_v("Use Case: UC09 - Delete Patient")])])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_v("MSS:")])])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("No.")]),_v(" "),_c('th',[_v("MSS")]),_v(" "),_c('th',[_v("Extensions")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_v("1")]),_v(" "),_c('td',[_v("Nutritionist wants to remove a patient from the system.")]),_v(" "),_c('td',[_v("N.A.")])]),_v(" "),_c('tr',[_c('td',[_v("2")]),_v(" "),_c('td',[_v("Nutritionist types the delete command with either an index or email.")]),_v(" "),_c('td',[_v("The index or email is invalid or not found."),_c('br'),_v("  (a) VitaBook displays an error.")])]),_v(" "),_c('tr',[_c('td',[_v("3")]),_v(" "),_c('td',[_v("VitaBook validates the input and deletes the patient.")]),_v(" "),_c('td',[_v("N.A.")])]),_v(" "),_c('tr',[_c('td',[_v("3")]),_v(" "),_c('td',[_v("VitaBook displays a confirmation message. Use case ends.")]),_v(" "),_c('td',[_v("N.A.")])])])])])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_v("Use Case: UC10 - History Navigation")])])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_v("MSS:")])])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("No.")]),_v(" "),_c('th',[_v("MSS")]),_v(" "),_c('th',[_v("Extensions")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_v("1")]),_v(" "),_c('td',[_v("Nutritionist wants to reuse a previously entered command.")]),_v(" "),_c('td',[_v("N.A.")])]),_v(" "),_c('tr',[_c('td',[_v("2")]),_v(" "),_c('td',[_v("Nutritionist presses the up ( ↑ ) or down ( ↓ ) arrow keys.")]),_v(" "),_c('td',[_v("No previous or next command exists."),_c('br'),_v("  (a) VitaBook does not change the current input.")])]),_v(" "),_c('tr',[_c('td',[_v("3")]),_v(" "),_c('td',[_v("VitaBook displays the previous or next command in the input box.")]),_v(" "),_c('td',[_v("N.A.")])]),_v(" "),_c('tr',[_c('td',[_v("3")]),_v(" "),_c('td',[_v("Nutritionist can re-execute or modify it. Use case ends.")]),_v(" "),_c('td',[_v("N.A.")])])])])])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_v("Use Case: UC11 - Clear All Patients")])])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_v("MSS:")])])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("No.")]),_v(" "),_c('th',[_v("MSS")]),_v(" "),_c('th',[_v("Extensions")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_v("1")]),_v(" "),_c('td',[_v("Nutritionist wants to remove all patient data.")]),_v(" "),_c('td',[_v("N.A.")])]),_v(" "),_c('tr',[_c('td',[_v("2")]),_v(" "),_c('td',[_v("Nutritionist types the clear command.")]),_v(" "),_c('td',[_v("The command was entered by mistake."),_c('br'),_v("  (a) VitaBook may include a confirmation step before executing.")])]),_v(" "),_c('tr',[_c('td',[_v("3")]),_v(" "),_c('td',[_v("VitaBook deletes all patient entries.")]),_v(" "),_c('td',[_v("N.A.")])]),_v(" "),_c('tr',[_c('td',[_v("3")]),_v(" "),_c('td',[_v("VitaBook confirms that the data has been cleared. Use case ends.")]),_v(" "),_c('td',[_v("N.A.")])])])])])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_v("Use Case: UC12 - Exit Application")])])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_v("MSS:")])])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("No.")]),_v(" "),_c('th',[_v("MSS")]),_v(" "),_c('th',[_v("Extensions")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_v("1")]),_v(" "),_c('td',[_v("Nutritionist is done using the application.")]),_v(" "),_c('td',[_v("N.A.")])]),_v(" "),_c('tr',[_c('td',[_v("2")]),_v(" "),_c('td',[_v("Nutritionist types the exit command.")]),_v(" "),_c('td',[_v("N.A.")])]),_v(" "),_c('tr',[_c('td',[_v("3")]),_v(" "),_c('td',[_v("VitaBook saves any unsaved data.")]),_v(" "),_c('td',[_v("N.A.")])]),_v(" "),_c('tr',[_c('td',[_v("3")]),_v(" "),_c('td',[_v("VitaBook shuts down the CLI. Use case ends.")]),_v(" "),_c('td',[_v("N.A.")])])])])])}
},function anonymous(
) {
with(this){return _c('h2',{attrs:{"id":"non-functional-requirements-nfrs"}},[_c('strong',[_v("Non-Functional Requirements (NFRs)")]),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#non-functional-requirements-nfrs","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"1-performance"}},[_v("1. "),_c('strong',[_v("Performance")]),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#1-performance","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("ID")]),_v(" "),_c('th',[_v("Requirement")]),_v(" "),_c('th',[_v("Metric")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_v("P1")]),_v(" "),_c('td',[_v("95% of commands (e.g., "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("add")]),_v(", "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("list")]),_v(") respond within "),_c('strong',[_v("2 seconds")]),_v(" for 1,000 patients.")]),_v(" "),_c('td',[_v("≤2s latency")])]),_v(" "),_c('tr',[_c('td',[_v("P2")]),_v(" "),_c('td',[_v("Startup time (from launch to ready state) under "),_c('strong',[_v("3 seconds")]),_v(".")]),_v(" "),_c('td',[_v("3s max")])]),_v(" "),_c('tr',[_c('td',[_v("P3")]),_v(" "),_c('td',[_v("A user with above average typing speed for regular English text (i.e. not code, not system admin commands) should be able to accomplish most of the tasks faster using commands than using the mouse.")]),_v(" "),_c('td')]),_v(" "),_c('tr',[_c('td',[_v("P4")]),_v(" "),_c('td',[_v("The product's file size, including the JAR file and necessary assets, should not exceed 100MB.")]),_v(" "),_c('td')]),_v(" "),_c('tr',[_c('td',[_v("P5")]),_v(" "),_c('td',[_v("The user guide (UG) and design document (DG) should each be under 15MB, with optimized images and content to meet the file size limit.")]),_v(" "),_c('td')])])])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"2-usability"}},[_v("2. "),_c('strong',[_v("Usability")]),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#2-usability","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("ID")]),_v(" "),_c('th',[_v("Requirement")]),_v(" "),_c('th',[_v("Metric")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_v("U1")]),_v(" "),_c('td',[_v("A novice user should learn all basic commands within "),_c('strong',[_v("15 minutes")]),_v(".")]),_v(" "),_c('td',[_v("Tutorial completion time")])]),_v(" "),_c('tr',[_c('td',[_v("U2")]),_v(" "),_c('td',[_v("CLI error messages must clearly explain how to fix the issue (e.g., "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Error: Missing 'n/'. Usage: add n/NAME...")]),_v(").")]),_v(" "),_c('td',[_v("User testing feedback")])])])])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"3-compatibility"}},[_v("3. "),_c('strong',[_v("Compatibility")]),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#3-compatibility","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("ID")]),_v(" "),_c('th',[_v("Requirement")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_v("C1")]),_v(" "),_c('td',[_v("Works on "),_c('strong',[_v("Windows 10+, macOS 12+, Linux (Ubuntu 20.04+)")]),_v(" with Java 17+.")])]),_v(" "),_c('tr',[_c('td',[_v("C2")]),_v(" "),_c('td',[_v("Supports screen resolutions ≥1280x720 at 100-150% scaling.")])]),_v(" "),_c('tr',[_c('td',[_v("C3")]),_v(" "),_c('td',[_v("The application should be portable, working without an installer. It should be distributed in a single JAR file for easy execution on different platforms.")])])])])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"4-data-integrity"}},[_v("4. "),_c('strong',[_v("Data Integrity")]),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#4-data-integrity","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("ID")]),_v(" "),_c('th',[_v("Requirement")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_v("D1")]),_v(" "),_c('td',[_v("Auto-saves to "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("./data/vitabook.json")]),_v(" after every modifying command.")])]),_v(" "),_c('tr',[_c('td',[_v("D2")]),_v(" "),_c('td',[_v("Data file must be human-editable (plaintext JSON) for emergency recovery.")])]),_v(" "),_c('tr',[_c('td',[_v("D3")]),_v(" "),_c('td',[_v("The application should not use a DBMS to store data.")])])])])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"5-security"}},[_v("5. "),_c('strong',[_v("Security")]),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#5-security","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("ID")]),_v(" "),_c('th',[_v("Requirement")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_v("S1")]),_v(" "),_c('td',[_v("Data files restrict read/write access to the user only (no global permissions).")])]),_v(" "),_c('tr',[_c('td',[_v("S2")]),_v(" "),_c('td',[_v("No internet connectivity required—all data stays locally.")])])])])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"6-scalability"}},[_v("6. "),_c('strong',[_v("Scalability")]),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#6-scalability","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("ID")]),_v(" "),_c('th',[_v("Requirement")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_v("SC1")]),_v(" "),_c('td',[_v("Supports up to "),_c('strong',[_v("1,000 patients")]),_v(" without performance degradation.")])])])])])}
},function anonymous(
) {
with(this){return _c('h2',{attrs:{"id":"glossary"}},[_v("Glossary"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#glossary","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"core-concepts"}},[_v("Core Concepts"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#core-concepts","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("Term")]),_v(" "),_c('th',[_v("Definition")]),_v(" "),_c('th',[_v("Example/Notes")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_c('strong',[_v("Patient")])]),_v(" "),_c('td',[_v("An individual under nutritional care with stored health/dietary data.")]),_v(" "),_c('td',[_v("Created via "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("add n/John Doe d/vegan")])])]),_v(" "),_c('tr',[_c('td',[_c('strong',[_v("Nutritionist")])]),_v(" "),_c('td',[_v("Healthcare professional managing patient diets via VitaBook.")]),_v(" "),_c('td',[_v("Primary user of the application.")])]),_v(" "),_c('tr',[_c('td',[_c('strong',[_v("CLI")])]),_v(" "),_c('td',[_v("Command-Line Interface for text-based commands.")]),_v(" "),_c('td',[_v("Faster than GUI (e.g., "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("edit 1 p/98765432")]),_v(" updates phone number).")])]),_v(" "),_c('tr',[_c('td',[_c('strong',[_v("GUI")])]),_v(" "),_c('td',[_v("Graphical User Interface (minimal use in VitaBook).")]),_v(" "),_c('td',[_v("Only displays results (e.g., patient lists).")])])])])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"technical-terms"}},[_v("Technical Terms"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#technical-terms","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("Term")]),_v(" "),_c('th',[_v("Definition")]),_v(" "),_c('th',[_v("Example/Notes")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_c('strong',[_v("JAR File")])]),_v(" "),_c('td',[_v("Executable Java package containing all dependencies.")]),_v(" "),_c('td',[_v("Run VitaBook via "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("java -jar vitabook.jar")])])]),_v(" "),_c('tr',[_c('td',[_c('strong',[_v("JSON")])]),_v(" "),_c('td',[_v("Data storage format for patient records.")]),_v(" "),_c('td',[_v("Human-editable file at "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("./data/patients.json")])])]),_v(" "),_c('tr',[_c('td',[_c('strong',[_v("Mainstream OS")])]),_v(" "),_c('td',[_v("Supported operating systems.")]),_v(" "),_c('td',[_v("Windows 10+, macOS 12+, Linux (Ubuntu 20.04+)")])])])])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"medical-dietary-terms"}},[_v("Medical/Dietary Terms"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#medical-dietary-terms","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("Term")]),_v(" "),_c('th',[_v("Definition")]),_v(" "),_c('th',[_v("Example/Notes")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_c('strong',[_v("Diet")])]),_v(" "),_c('td',[_v("Prescribed food regimen (e.g., vegan, keto).")]),_v(" "),_c('td',[_v("Filter via "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("filter d/keto")])])]),_v(" "),_c('tr',[_c('td',[_c('strong',[_v("Priority")])]),_v(" "),_c('td',[_v("Follow-up urgency level ("),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("high")]),_v("/"),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("medium")]),_v("/"),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("low")]),_v(").")]),_v(" "),_c('td',[_v("Set via "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("priority 1 pr/high")])])]),_v(" "),_c('tr',[_c('td',[_c('strong',[_v("Allergy")])]),_v(" "),_c('td',[_v("Food sensitivity requiring dietary exclusion.")]),_v(" "),_c('td',[_v("Tracked via "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("add ... al/peanuts")])])])])])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"command-syntax"}},[_v("Command Syntax"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#command-syntax","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("Term")]),_v(" "),_c('th',[_v("Definition")]),_v(" "),_c('th',[_v("Example/Notes")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_c('strong',[_v("Prefix")])]),_v(" "),_c('td',[_v("Shortcode before input values (e.g., "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("n/")]),_v(" for name).")]),_v(" "),_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("add n/Alice p/12345678")]),_v(" → "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("n/")]),_v(" and "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("p/")]),_v(" are prefixes.")])]),_v(" "),_c('tr',[_c('td',[_c('strong',[_v("Modifying Cmd")])]),_v(" "),_c('td',[_v("Commands that change data (tracked in undo history).")]),_v(" "),_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("add")]),_v(", "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("delete")]),_v(", "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("edit")])])]),_v(" "),_c('tr',[_c('td',[_c('strong',[_v("Non-Modifying Cmd")])]),_v(" "),_c('td',[_v("Read-only commands (excluded from undo history).")]),_v(" "),_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("list")]),_v(", "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("find")]),_v(", "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("help")])])])])])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"key-features"}},[_v("Key Features"),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#key-features","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("Term")]),_v(" "),_c('th',[_v("Definition")]),_v(" "),_c('th',[_v("Example/Notes")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_c('strong',[_v("Auto-save")])]),_v(" "),_c('td',[_v("Automatic data persistence after changes.")]),_v(" "),_c('td',[_v("Saves to JSON after "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("add")]),_v("/"),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("edit")]),_v("/"),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("delete")]),_v(".")])]),_v(" "),_c('tr',[_c('td',[_c('strong',[_v("Portability")])]),_v(" "),_c('td',[_v("Runs anywhere with Java 17 (no installation).")]),_v(" "),_c('td',[_v("Single JAR file deployment.")])]),_v(" "),_c('tr',[_c('td',[_c('strong',[_v("Case-Insensitive")])]),_v(" "),_c('td',[_v("Commands/filters ignore letter case.")]),_v(" "),_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("FILTER D/KETO")]),_v(" works same as "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("filter d/keto")])])])])])])}
},function anonymous(
) {
with(this){return _c('h2',{attrs:{"id":"appendix-instructions-for-manual-testing"}},[_c('strong',[_v("Appendix: Instructions for manual testing")]),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#appendix-instructions-for-manual-testing","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_v("Note:")]),_v(" These instructions provide a foundation for testers. Exploratory testing is encouraged.")])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"launch-and-shutdown"}},[_c('strong',[_v("Launch and Shutdown")]),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#launch-and-shutdown","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('ol',[_c('li',[_c('p',[_c('strong',[_v("Initial Launch")])]),_v(" "),_c('ul',[_c('li',[_c('em',[_v("Test Case")]),_v(":\n"),_c('ul',[_c('li',[_v("Download JAR → double-click in empty folder.")]),_v(" "),_c('li',[_c('em',[_v("Expected")]),_v(": GUI opens with sample patients (window size may need adjustment).")])])])])]),_v(" "),_c('li',[_c('p',[_c('strong',[_v("Window Preferences")])]),_v(" "),_c('ul',[_c('li',[_c('em',[_v("Test Case")]),_v(":\n"),_c('ul',[_c('li',[_v("Resize/move window → close → relaunch.")]),_v(" "),_c('li',[_c('em',[_v("Expected")]),_v(": Retains last window size/position.")])])])])])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"command-tests"}},[_c('strong',[_v("Command Tests")]),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#command-tests","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('h4',{attrs:{"id":"add-patient"}},[_c('strong',[_v("Add Patient")]),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#add-patient","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("Test Case")]),_v(" "),_c('th',[_v("Prerequisite")]),_v(" "),_c('th',[_v("Expected Outcome")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("add n/John Doe g/m h/1.75 w/70 p/91234567 e/john@example.com a/Block 123 d/low sodium m/2025-04-01 pr/low")])]),_v(" "),_c('td',[_v("No patient with "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("john@example.com")])]),_v(" "),_c('td',[_v("Success + new patient listed")])]),_v(" "),_c('tr',[_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("add")]),_v(" (no fields)")]),_v(" "),_c('td',[_v("-")]),_v(" "),_c('td',[_v("Shows "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("MESSAGE_USAGE")]),_v(" with required fields")])]),_v(" "),_c('tr',[_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("add n/Alice Tan ... e/john@example.com")])]),_v(" "),_c('td',[_v("Patient with "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("john@example.com")]),_v(" exists")]),_v(" "),_c('td',[_v("Error: "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("\"This patient already exists\"")])])])])])])}
},function anonymous(
) {
with(this){return _c('h4',{attrs:{"id":"edit-patient"}},[_c('strong',[_v("Edit Patient")]),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#edit-patient","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("Test Case")]),_v(" "),_c('th',[_v("Prerequisite")]),_v(" "),_c('th',[_v("Expected Outcome")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("edit 1 p/98765432")])]),_v(" "),_c('td',[_v("≥1 patient in list")]),_v(" "),_c('td',[_v("Updates phone number for patient 1")])]),_v(" "),_c('tr',[_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("edit 1")]),_v(" (no fields)")]),_v(" "),_c('td',[_v("≥1 patient")]),_v(" "),_c('td',[_v("Error: "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("\"At least one field to edit must be provided\"")])])]),_v(" "),_c('tr',[_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("edit 999 e/abc@example.com")])]),_v(" "),_c('td',[_v("List has <999 patients")]),_v(" "),_c('td',[_v("Error: "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("\"Invalid patient index\"")])])])])])])}
},function anonymous(
) {
with(this){return _c('h4',{attrs:{"id":"remark-command"}},[_c('strong',[_v("Remark Command")]),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#remark-command","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("Test Case")]),_v(" "),_c('th',[_v("Prerequisite")]),_v(" "),_c('th',[_v("Expected Outcome")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("remark 1 r/Very cooperative")])]),_v(" "),_c('td',[_v("≥1 patient")]),_v(" "),_c('td',[_v("Adds remark to patient 1")])]),_v(" "),_c('tr',[_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("remark 0 r/Test")])]),_v(" "),_c('td',[_v("-")]),_v(" "),_c('td',[_v("Error: "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("\"Invalid index\"")])])])])])])}
},function anonymous(
) {
with(this){return _c('h4',{attrs:{"id":"priority-command"}},[_c('strong',[_v("Priority Command")]),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#priority-command","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("Test Case")]),_v(" "),_c('th',[_v("Prerequisite")]),_v(" "),_c('th',[_v("Expected Outcome")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("priority 2 high")])]),_v(" "),_c('td',[_v("≥2 patients")]),_v(" "),_c('td',[_v("Updates priority of patient 2 to "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("high")])])]),_v(" "),_c('tr',[_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("priority 1 urgent")])]),_v(" "),_c('td',[_v("≥1 patient")]),_v(" "),_c('td',[_v("Error: "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("\"Priority must be low/medium/high\"")])])]),_v(" "),_c('tr',[_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("priority 10 high")])]),_v(" "),_c('td',[_v("<10 patients")]),_v(" "),_c('td',[_v("Error: "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("\"Invalid patient index\"")])])])])])])}
},function anonymous(
) {
with(this){return _c('h4',{attrs:{"id":"find-command"}},[_c('strong',[_v("Find Command")]),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#find-command","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("Test Case")]),_v(" "),_c('th',[_v("Prerequisite")]),_v(" "),_c('th',[_v("Expected Outcome")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("find John")])]),_v(" "),_c('td',[_v("≥1 patient with \"John\" in name")]),_v(" "),_c('td',[_v("Lists matching patients")])]),_v(" "),_c('tr',[_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("find")]),_v(" (no keyword)")]),_v(" "),_c('td',[_v("-")]),_v(" "),_c('td',[_v("Error: "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("\"Keyword cannot be empty\"")])])]),_v(" "),_c('tr',[_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("find zz")])]),_v(" "),_c('td',[_v("No patient with \"zz\"")]),_v(" "),_c('td',[_v("Shows empty list")])])])])])}
},function anonymous(
) {
with(this){return _c('h4',{attrs:{"id":"filter-command"}},[_c('strong',[_v("Filter Command")]),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#filter-command","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("Test Case")]),_v(" "),_c('th',[_v("Prerequisite")]),_v(" "),_c('th',[_v("Expected Outcome")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("filter g/f")])]),_v(" "),_c('td',[_v("≥1 female patient")]),_v(" "),_c('td',[_v("Lists only female patients")])]),_v(" "),_c('tr',[_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("filter x/test")])]),_v(" "),_c('td',[_v("-")]),_v(" "),_c('td',[_v("Error: "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("\"Invalid filter prefix\"")])])]),_v(" "),_c('tr',[_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("filter g/Male")])]),_v(" "),_c('td',[_v("-")]),_v(" "),_c('td',[_v("Error: "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("\"Gender must be 'm' or 'f'\"")])])])])])])}
},function anonymous(
) {
with(this){return _c('h4',{attrs:{"id":"sort-command"}},[_c('strong',[_v("Sort Command")]),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#sort-command","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("Test Case")]),_v(" "),_c('th',[_v("Prerequisite")]),_v(" "),_c('th',[_v("Expected Outcome")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("sort name")])]),_v(" "),_c('td',[_v("Multiple patients")]),_v(" "),_c('td',[_v("Sorts alphabetically by name")])]),_v(" "),_c('tr',[_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("sort priority")])]),_v(" "),_c('td',[_v("Multiple patients")]),_v(" "),_c('td',[_v("Sorts by priority (high→low) then name")])]),_v(" "),_c('tr',[_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("sort invalid")])]),_v(" "),_c('td',[_v("-")]),_v(" "),_c('td',[_v("Error: "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("\"Invalid sort type. Use: priority/name/diet\"")])])])])])])}
},function anonymous(
) {
with(this){return _c('h4',{attrs:{"id":"delete-command"}},[_c('strong',[_v("Delete Command")]),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#delete-command","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("Test Case")]),_v(" "),_c('th',[_v("Prerequisite")]),_v(" "),_c('th',[_v("Expected Outcome")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("delete 1")])]),_v(" "),_c('td',[_v("≥1 patient")]),_v(" "),_c('td',[_v("Deletes patient at index 1")])]),_v(" "),_c('tr',[_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("delete fake@email.com")])]),_v(" "),_c('td',[_v("No patient with this email")]),_v(" "),_c('td',[_v("Error: "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("\"No patient found with this email\"")])])])])])])}
},function anonymous(
) {
with(this){return _c('h4',{attrs:{"id":"clear-command"}},[_c('strong',[_v("Clear Command")]),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#clear-command","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("Test Case")]),_v(" "),_c('th',[_v("Prerequisite")]),_v(" "),_c('th',[_v("Expected Outcome")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("clear")])]),_v(" "),_c('td',[_v("Multiple patients")]),_v(" "),_c('td',[_v("Prompts confirmation before clearing")])])])])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"undo-redo-testing"}},[_c('strong',[_v("Undo/Redo Testing")]),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#undo-redo-testing","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("Test Case")]),_v(" "),_c('th',[_v("Steps")]),_v(" "),_c('th',[_v("Expected Outcome")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_v("Basic undo/redo")]),_v(" "),_c('td',[_v("1. "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("add")]),_v(" → 2. "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("undo")]),_v(" → 3. "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("redo")])]),_v(" "),_c('td',[_v("2. Reverts add → 3. Restores add")])]),_v(" "),_c('tr',[_c('td',[_v("Undo at initial state")]),_v(" "),_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("undo")]),_v(" with no history")]),_v(" "),_c('td',[_v("Error: "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("\"No previous state to undo\"")])])]),_v(" "),_c('tr',[_c('td',[_v("State purge")]),_v(" "),_c('td',[_v("1. "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("add")]),_v(" → 2. "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("undo")]),_v(" → 3. "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("add")]),_v(" → 4. "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("redo")])]),_v(" "),_c('td',[_v("4. Error: "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("\"No next state to redo\"")])])])])])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"general-edge-cases-2"}},[_c('strong',[_v("General Edge Cases")]),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#general-edge-cases-2","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('div',{staticClass:"table-responsive"},[_c('table',{staticClass:"markbind-table table table-bordered table-striped"},[_c('thead',[_c('tr',[_c('th',[_v("Scenario")]),_v(" "),_c('th',[_v("Test Case")]),_v(" "),_c('th',[_v("Expected Outcome")])])]),_v(" "),_c('tbody',[_c('tr',[_c('td',[_v("Invalid command")]),_v(" "),_c('td',[_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("invalidCmd")])]),_v(" "),_c('td',[_v("Shows error + command list")])]),_v(" "),_c('tr',[_c('td',[_v("File corruption")]),_v(" "),_c('td',[_v("Manually corrupt "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("data/patients.json")])]),_v(" "),_c('td',[_v("Auto-generates new file on launch")])]),_v(" "),_c('tr',[_c('td',[_v("Keyboard interrupt")]),_v(" "),_c('td',[_v("Press "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("Ctrl+C")]),_v(" during command")]),_v(" "),_c('td',[_v("Returns to input prompt")])])])])])}
},function anonymous(
) {
with(this){return _c('h3',{attrs:{"id":"exploratory-testing-tips"}},[_c('strong',[_v("Exploratory Testing Tips")]),_c('a',{staticClass:"fa fa-anchor",attrs:{"href":"#exploratory-testing-tips","onclick":"event.stopPropagation()"}})])}
},function anonymous(
) {
with(this){return _c('ol',[_c('li',[_c('strong',[_v("Combination Testing")]),_v(":\n"),_c('ul',[_c('li',[_v("Chain commands (e.g., "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("add")]),_v(" → "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("edit")]),_v(" → "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("undo")]),_v(" → "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("filter")]),_v(").")])])]),_v(" "),_c('li',[_c('strong',[_v("Data Limits")]),_v(":\n"),_c('ul',[_c('li',[_v("Test with 1000+ patients for performance.")])])]),_v(" "),_c('li',[_c('strong',[_v("Localization")]),_v(":\n"),_c('ul',[_c('li',[_v("Non-English names (e.g., "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("add n/李华")]),_v(").")])])])])}
},function anonymous(
) {
with(this){return _c('p',[_c('strong',[_v("Critical")]),_v(": Always back up "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("data/patients.json")]),_v(" before testing destructive commands ("),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("clear")]),_v(", "),_c('code',{pre:true,attrs:{"class":"hljs inline no-lang"}},[_v("delete")]),_v(").")])}
},function anonymous(
) {
with(this){return _c('footer',[_c('div',{staticClass:"text-center"},[_c('small',[_v("["),_c('span',[_c('strong',[_v("Powered by")])]),_v(" "),_c('img',{attrs:{"src":"https://markbind.org/favicon.ico","width":"30"}}),_v(" "),_c('a',{attrs:{"href":"https://markbind.org/"}},[_v("MarkBind 5.6.0")]),_v(", generated on Fri, 4 Apr 2025, 20:42:00 GMT+8]")])])])}
}];
  