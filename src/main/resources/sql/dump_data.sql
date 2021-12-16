INSERT INTO public.Category( ID, NAME, BREAKDOWN, TOP_CATEGORY_ID)  VALUES (	1	,'Moda',	1	,	null	);
INSERT INTO public.Category( ID, NAME, BREAKDOWN, TOP_CATEGORY_ID)  VALUES (	2	,'Elektronik',	1	,	null	);
INSERT INTO public.Category( ID, NAME, BREAKDOWN, TOP_CATEGORY_ID)  VALUES (	3	,'Ev & Yaşam',	1	,	null	);
INSERT INTO public.Category( ID, NAME, BREAKDOWN, TOP_CATEGORY_ID)  VALUES (	4	,'Elbise',	2	,	1	);
INSERT INTO public.Category( ID, NAME, BREAKDOWN, TOP_CATEGORY_ID)  VALUES (	5	,'Gömlek',	2	,	1	);
INSERT INTO public.Category( ID, NAME, BREAKDOWN, TOP_CATEGORY_ID)  VALUES (	6	,'Bilgisayar',	2	,	2	);
INSERT INTO public.Category( ID, NAME, BREAKDOWN, TOP_CATEGORY_ID)  VALUES (	7	,'Dizüstü Bilgisayar',	3	,	6	);
INSERT INTO public.Category( ID, NAME, BREAKDOWN, TOP_CATEGORY_ID)  VALUES (	8	,'Mobilya',	2	,	3	);
INSERT INTO public.Category( ID, NAME, BREAKDOWN, TOP_CATEGORY_ID)  VALUES (	9	,'Sehpa',	3	,	8	);





INSERT INTO public.PRODUCT( ID, NAME, PRICE, CREATED_DATE, CATEGORY_ID) VALUES (	1	,'Mavi Elbise',	200	, now(), 	4);
INSERT INTO public.PRODUCT( ID, NAME, PRICE, CREATED_DATE, CATEGORY_ID) VALUES (	2	,'Kırmızı Elbise',	300	, now(), 	4);
INSERT INTO public.PRODUCT( ID, NAME, PRICE, CREATED_DATE, CATEGORY_ID) VALUES (	3	,'Mavi Gömlek',	500	, now(), 	5);
INSERT INTO public.PRODUCT( ID, NAME, PRICE, CREATED_DATE, CATEGORY_ID) VALUES (	4	,'Sarı Gömlek',	450	, now(), 	5);
INSERT INTO public.PRODUCT( ID, NAME, PRICE, CREATED_DATE, CATEGORY_ID) VALUES (	5	,'HP ',	15000	, now(), 	7);
INSERT INTO public.PRODUCT( ID, NAME, PRICE, CREATED_DATE, CATEGORY_ID) VALUES (	6	,'MSI',	20000	, now(), 	7);
INSERT INTO public.PRODUCT( ID, NAME, PRICE, CREATED_DATE, CATEGORY_ID) VALUES (	7	,'Orta Sehpa',	600	, now(), 	9);




INSERT INTO public.USER(ID, FIRST_NAME, LAST_NAME, EMAIL, CELL_PHONE,USERNAME) VALUES(1, N'ASIM', N'KILIÇ', N'asimkilic@patika.dev', N'+90123456789',N'asimkilic');
INSERT INTO public.USER(ID, FIRST_NAME, LAST_NAME, EMAIL, CELL_PHONE,USERNAME) VALUES(2, N'JAMES', N'GOSLING', N'james@patika.dev', N'+90119653789',N'jamesgosling');
INSERT INTO public.USER(ID, FIRST_NAME, LAST_NAME, EMAIL, CELL_PHONE,USERNAME) VALUES(3, N'DENNIS', N'RITCHIE', N'dennis@patika.dev', N'+90158366789',N'dennisritchie');
INSERT INTO public.USER(ID, FIRST_NAME, LAST_NAME, EMAIL, CELL_PHONE,USERNAME) VALUES(4, N'LINUS', N'TORVALDS', N'linus@patika.dev', N'+90123446289',N'linustorvalds');



INSERT INTO public.PRODUCT_COMMENT(ID, PRODUCT_ID, USER_ID, COMMENT_DATE, COMMENT) VALUES(1,1, 1, now(), N'FİYAT PERFORMANS AÇISINDAN GÜZEL BİR BİLGİSAYAR');
INSERT INTO public.PRODUCT_COMMENT(ID, PRODUCT_ID, USER_ID, COMMENT_DATE, COMMENT) VALUES(2,2, 1, now(), N'Phasellus maximus euismod volutpat. Mauris ullamcorper suscipit venenatis.');
INSERT INTO public.PRODUCT_COMMENT(ID, PRODUCT_ID, USER_ID, COMMENT_DATE, COMMENT) VALUES(3,3, 2, now(), N'Aliquam scelerisque rutrum tristique. Vivamus massa purus, bibendum posuere aliquet a, congue eget magna.');
INSERT INTO public.PRODUCT_COMMENT(ID, PRODUCT_ID, USER_ID, COMMENT_DATE, COMMENT) VALUES(4,4, 3, now(), N'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam convallis elit ligula, non pulvinar arcu semper in. Sed massa lacus, lobortis eget varius id, imperdiet eget enim.');
INSERT INTO public.PRODUCT_COMMENT(ID, PRODUCT_ID, USER_ID, COMMENT_DATE, COMMENT) VALUES(5,2, 4, now(), N'Maecenas vitae consequat metus. ');
INSERT INTO public.PRODUCT_COMMENT(ID, PRODUCT_ID, USER_ID, COMMENT_DATE, COMMENT) VALUES(6,1, 3, now(), N'Phasellus leo justo, facilisis a metus a, ultricies egestas arcu.');
INSERT INTO public.PRODUCT_COMMENT(ID, PRODUCT_ID, USER_ID, COMMENT_DATE, COMMENT) VALUES(7,3, 2, now(), N'Phasellus maximus euismod volutpat. Mauris ullamcorper suscipit venenatis.');
INSERT INTO public.PRODUCT_COMMENT(ID, PRODUCT_ID, USER_ID, COMMENT_DATE, COMMENT) VALUES(8,1, 1, now(), N'Aliquam scelerisque rutrum tristique. Vivamus massa purus, bibendum posuere aliquet a, congue eget magna.');
INSERT INTO public.PRODUCT_COMMENT(ID, PRODUCT_ID, USER_ID, COMMENT_DATE, COMMENT) VALUES(9,2, 2, now(), N'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam convallis elit ligula, non pulvinar arcu semper in. Sed massa lacus, lobortis eget varius id, imperdiet eget enim.');
INSERT INTO public.PRODUCT_COMMENT(ID, PRODUCT_ID, USER_ID, COMMENT_DATE, COMMENT) VALUES(10,2, 3, now(), N'Maecenas vitae consequat metus. ');
INSERT INTO public.PRODUCT_COMMENT(ID, PRODUCT_ID, USER_ID, COMMENT_DATE, COMMENT) VALUES(11,1, 2, now(), N'Phasellus leo justo, facilisis a metus a, ultricies egestas arcu.');
INSERT INTO public.PRODUCT_COMMENT(ID, PRODUCT_ID, USER_ID, COMMENT_DATE, COMMENT) VALUES(12,3, 4, now(), N'Phasellus maximus euismod volutpat. Mauris ullamcorper suscipit venenatis.');
INSERT INTO public.PRODUCT_COMMENT(ID, PRODUCT_ID, USER_ID, COMMENT_DATE, COMMENT) VALUES(13,2, 3, now(), N'Aliquam scelerisque rutrum tristique. Vivamus massa purus, bibendum posuere aliquet a, congue eget magna.');
INSERT INTO public.PRODUCT_COMMENT(ID, PRODUCT_ID, USER_ID, COMMENT_DATE, COMMENT) VALUES(14,3, 3, now(), N'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam convallis elit ligula, non pulvinar arcu semper in. Sed massa lacus, lobortis eget varius id, imperdiet eget enim.');
INSERT INTO public.PRODUCT_COMMENT(ID, PRODUCT_ID, USER_ID, COMMENT_DATE, COMMENT) VALUES(15,4, 2, now(), N'Maecenas vitae consequat metus. ');
INSERT INTO public.PRODUCT_COMMENT(ID, PRODUCT_ID, USER_ID, COMMENT_DATE, COMMENT) VALUES(16,3, 1, now(), N'Phasellus leo justo, facilisis a metus a, ultricies egestas arcu.');



