/**
 * Define a grammar called Hello
 */

grammar QueuingT;

//Composicion
codigo : head network_description footer;

head   : NODES EQ INT;

network_description : (node_description | connection)*;

node_description : DESNODO ABR_CC (node_property)* CRR_CC;

node_property : propertyid
			  | propertyqd
			  | propertysd
			  | propertynumberofservers
			  | propertycustinq;

propertyid : ARTID EQ INT;
propertyqd : ATRQD EQ dist;
propertysd : ATRSD EQ dist;
propertynumberofservers: NSN EQ INT;
propertycustinq : CUSIQ EQ INT;


dist	: und
		| expd;
		
und		: UN ABR_CR (INT | DOBL) COMA (INT | DOBL) CRR_CR;
expd	: EXP ABR_CR (INT | DOBL) CRR_CR ;

connection : CONEX ABR_CC (id_con)+ CRR_CC;

id_con :  propertyidstart
	   |  propertyidend
	   |  prob;

prob   : PBB EQ (DOBL | INT);
propertyidstart :  ATRIDS EQ INT;
propertyidend :   ATRIDE  EQ INT;  

footer : stime (ANLT ABR_CC (analitics)* CRR_CC)?;

stime : SIM EQ (ID | INT);

analitics : ACS
          | ACQ
          | TCS
          | TCQ
          | US;
                            

/*		
 * ---- LEXER ----
 */				
 
// Corchetes cuadrados
ABR_CC	: '[';
CRR_CC	: ']';
ABR_CR	: '(';
CRR_CR	: ')';

//Operadores:
NOT		: 'not';
// ---
MULT 	: '*';
DIV 	: '/';
MOD		: '%';
MAS 	: '+';
MENOS 	: '-';
// ---
MENQ	: '<';
MENIG	: '<=';
MAYQ	: '>';
MAYIG	: '>=';
IGL		: '==';
NIGL	: '!=';
// ---
AND		: 'and';
OR		: 'or';
// ---
EQ		: '=';
// ---
COMA	: ',';
PYC		: ';';

// Comillas
CML	: '\'';

/*		
 * ---- REGLAS LEXICAS Y PALABRAS RESERVADAS----
 */	

EXP     : 'exponential'; 
UN		: 'uniform'; 
NODES   : 'nodes';
CUSIQ	: 'customers_in_queue';
DESNODO : 'describe_node';
ATRSD   : 'server_distribution';
NSN     : 'number_of_servers';
ATRQD	: 'queue_distribution';
ARTID   : 'id'; 
CONEX   : 'describe_connection';
ATRIDS  : 'id_start';
ATRIDE  : 'id_end';
PBB		: 'probability';
SIM     : 'simulation_time';
ANLT    : 'analytics';
ACS		: 'avg_customer_system';
ACQ		: 'avg_customer_queue';
TCS		: 'avgt_customer_system';
TCQ		: 'avgt_customer_queue';
US		: 'use_of_servers';


/**
 * ---- TOKENS GENERALES ----
 */
 
INT 	: ('0'..'9')+;
ID		: LETRAS+('_'?(LETRAS|INT)+)*;
STR		: CML ('\\' '\'' | . )*? CML;
SIGINT 	: '-'?('0'..'9')+;
DOBL    : SIGINT '.' INT?;
LETRAS 	: ('a'..'z' | 'A'..'Z');
 
// Comentarios
CMT_MULTI   : '/*' .*? '*/' -> skip;
CMT_SIMPL   : '//' ~[\r\n]* -> skip;

WS : [ \t\r\n]+ -> skip; //skip spaces, tabs, newlines
