

package com.danielalvarado.typingpro;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.InputStream;
import java.util.ArrayList;
//import java.util.Date;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import static java.util.concurrent.TimeUnit.SECONDS;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.sound.sampled.AudioInputStream;
//import javax.sound.sampled.AudioSystem;
//import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

//PONER MUSICA DE FONDO
public class TypingPro extends JFrame{

    String words[] = {
"abandonar","abrir","absoluto","abuelo","acabar","acaso","acción","aceptar","acercar","acompañar",
"actitud","actividad","acto","actual","actuar","acudir","acuerdo","adelante","además","adquirir",
"afectar","afirmar","agua","ahí","ahora","aire","alcanzar","alejar","alemán","algo",
"algún","alguno","allá","allí","alma","alto","altura","amar","ambos","americano",
"amor","amplio","añadir","análisis","andar","animal","año","ante","anterior","antes",
"anunciar","aparecer","apenas","aplicar","apoyar","aprender","aprovechar","aquel","aquello","aquí",
"arma","arriba","arte","asegurar","así","aspecto","asunto","atención","atrás","atreverse",
"aún","aunque","auténtico","autor","autoridad","avanzar","ayer","ayuda","ayudar","azul",
"bajo","barcelona","barrio","base","bastante","bastar","beber","bien","blanco","boca",
"buen","buscar","caballo","caber","cabeza","cabo","cada","cadena","caer","calle",
"cambiar","cambio","caminar","camino","campaña","campo","cantar","cantidad","capacidad","capaz",
"cara","carácter","carne","carrera","carta","casa","casar","casi","caso","catalán",
"celebrar","célula","central","centro","cerebro","cerrar","chica","cielo","ciencia","científico",
"cierto","cinco","cine","circunstancia","ciudad","ciudadano","civil","claro","clase","coche",
"colocar","color","comentar","comenzar","comer","como","cómo","compañero","compañía","completo",
"comprender","comprobar","común","comunicación","con","concepto","conciencia","concreto","condición","conducir",
"conocer","conocimiento","consecuencia","conseguir","conservar","considerar","consistir","constante","constituir","construir",
"contar","contemplar","contener","contestar","continuar","contra","contrario","control","controlar","convencer",
"convertir","corazón","correr","corresponder","corriente","cortar","cosa","costumbre","crear","crecer",
"cruzar","cuadro","cual","cuál","cualquier","cuando","cuanto","cuánto","cuarto","cuatro",
"cuenta","cuerpo","cuestión","cultura","cultural","cumplir","cuyo","dar","dato","deber",
"decir","decisión","declarar","dedicar","dedo","defender","defensa","definir","definitivo","dejar",
"demasiado","democracia","demostrar","dentro","depender","derecha","derecho","desaparecer","desarrollar","desarrollo",
"descubrir","desde","desear","deseo","despertar","después","destino","detener","determinar","día",
"diez","diferencia","diferente","difícil","dificultad","dinero","dios","dirección","directo","director",
"disponer","distancia","distinto","diverso","doble","doctor","dolor","don","donde","dónde",
"dos","duda","durante","duro","echar","económico","edad","efecto","ejemplo","ejército",
"elegir","elemento","elevar","empezar","empresa","encender","encima","encontrar","encuentro","energía",
"enfermo","enorme","enseñar","entender","enterar","entonces","entrada","entrar","entre","entregar",
"época","equipo","error","escapar","escribir","escritor","escuchar","ese","esfuerzo","eso",
"espalda","españa","español","española","especial","especie","esperanza","esperar","espíritu","ésta",
"estado","éste","este","esto","estrella","estructura","estudiar","estudio","etapa","europa",
"evidente","evitar","exigir","existencia","existir","éxito","experiencia","explicar","expresión","extender",
"extranjero","extraño","extremo","fácil","falta","faltar","familia","familiar","famoso","fenómeno",
"figura","figura","fijar","fin","final","físico","flor","fondo","forma","formar",
"francés","francia","frase","frecuencia","frente","frío","fuego","fuente","fuera","fuerte",
"función","funcionar","fundamental","fútbol","futuro","ganar","general","gente","gesto","gobierno",
"gracia","gran","grande","grave","gritar","grupo","guardar","guerra","gustar","gusto",
"habitación","habitual","hablar","hacer","hacia","hallar","has","hasta","hecho","hermana",
"hermoso","hija","hijo","historia","histórico","hombre","hombro","hora","hoy","humano",
"iglesia","igual","imagen","imaginar","impedir","imponer","importancia","importante","importar","imposible",
"incluso","indicar","individuo","información","informar","informar","inglés","iniciar","inmediato","insistir",
"intentar","interés","interesar","interior","internacional","introducir","ir","izquierda","jamás","jefe",
"juego","jugador","jugar","juicio","junto","junto","justo","labio","lado","lanzar",
"lector","leer","lengua","lenguaje","lento","levantar","ley","libertad","libre","libro",
"línea","literatura","llamar","llegar","llenar","lleno","llevar","llorar","lo","loco",
"lucha","luego","lugar","luz","madre","mal","malo","mañana","mandar","manera",
"mano","mantener","máquina","mar","marcar","marcha","marchar","marido","mas","más",
"matar","materia","material","máximo","mayor","mayoría","mediante","médico","medida","medio",
"memoria","menor","menos","menudo","mercado","merecer","mes","mesa","meter","método",
"miedo","miembro","mientes","mientras","mil","militar","millón","mínimo","ministro","minuto",
"mirada","mirar","mismo","mitad","modelo","moderno","modo","momento","moral","morir",
"motivo","mover","movimiento","muchacho","mucho","muerte","mujer","mundial","mundo","música",
"nacer","nacional","nada","nadie","natural","naturaleza","necesario","necesidad","necesitar","negar",
"negro","niña","ningún","ninguno","niño","nivel","noche","nombre","normal","norteamericano",
"noticia","novela","nuestro","nuevo","número","nunca","objetivo","objeto","obligar","obra",
"obtener","ocasión","ocho","ocupar","ocurrir","oficial","ofrecer","oír","ojo","olvidar",
"opinión","origen","oro","oscuro","otro","paciente","padre","pagar","página","país",
"palabra","papel","par","para","para","parar","parecer","pared","pareja","parte",
"particular","partido","partir","pasado","pasar","paso","paso","paz","pecho","pedir",
"peligro","pelo","pena","pensamiento","pensar","peor","pequeño","perder","perfecto","periódico",
"permanecer","permitir","pero","perro","persona","personaje","personal","pertenecer","pesar","peso",
"piedra","piel","pierna","piso","placer","plan","plantear","plaza","pleno","población",
"poco","poder","policía","política","político","poner","portón","por","porque","poseer",
"posible","posición","práctico","precio","preciso","preferir","pregunta","preguntar","prensa","preocupar",
"presencia","presentar","presente","presidente","pretender","primer","primero","principal","principio","privar",
"problema","proceso","producir","producto","profesional","profesor","profundo","programa","pronto","propio",
"provocar","próximo","proyecto","prueba","publicar","público","pueblo","pueblo","puerta","pues",
"punto","puro","que","qué","quedar","querer","quien","quién","quitar","quizá",
"rápido","rato","razón","real","realidad","realizar","recibir","reciente","recoger","reconocer",
"recorrer","recuerdo","recuperar","reducir","referir","régimen","regresar","reír","relación","religioso",
"representar","resolver","responder","responsable","respuesta","resto","resultado","resultar","reunión","reunir",
"rey","rico","riesgo","río","rodear","rojo","romper","ropa","rostro","saber",
"sala","salida","salir","sangre","secreto","sector","seguir","según","segundo","seguridad",
"seis","semana","semejante","señalar","señor","sensación","sentar","sentido","sentimiento","sentimiento",
"separar","ser","serie","serio","servicio","servir","sexo","sexual","sido","siempre",
"siglo","significar","siguiente","silencio","simple","sin","sinfonía","sino","sistema","sitio",
"situar","sobre","social","socialista","sociedad","sol","solo","sólo","solución","sombra",
"sonar","sonreír","sonrisa","sorprender","sostener","subir","suceder","suelo","sueño","suerte",
"sufrir","superar","superior","suponer","surgir","suyo","tal","también","tampoco","tan",
"tarde","tarea","técnico","televisión","tema","temer","tender","tener","teoría","tercer",
"término","texto","tía","tiempo","tierra","tío","tipo","tirar","título","tocar",
"todo","tomar","tono","total","trabajar","trabajo","traer","tras","tratar","tres",
"un","único","unidad","unir","uno","usar","uso","usted","utilizar","vacío",
"valor","varias","varios","vecino","veinte","velocidad","vender","venir","ventana","ver",
"verdad","verdadero","verde","vestir","vez","veces","viaje","vida","viejo","viento",
"vista","vivir","vivo","voluntad","volver","voz","voces","vuelta","ya","yo","zona"
};
    
    JButton refrescar;
    JButton Salir;
    JTextPane show_words;
    JTextArea write;
    JLabel tiempo;
    JLabel hud_image;
    
    JPanel resultados;
    
    JLabel eti_pal;
    JLabel num_pal_correctas;
    JLabel num_pal_incorrectas;
    
    JLabel eti_pul;
    JLabel num_pul_correctas;
    JLabel num_pul_incorrectas;
  
    JLabel n_total;
    JLabel n_ppm;
    JLabel eti_ppm;
    
    ArrayList<String> fila_uno = new ArrayList<String>();
    ArrayList<String> fila_dos = new ArrayList<String>();
    
    public TypingPro(){
        
        super ("Typing Pro");
            
        setSize(860, 400);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        getContentPane().setLayout(null); 
        setLocationRelativeTo(null);
        setBackground(new java.awt.Color(0, 0, 0));
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(TypingPro.class.getResource("/imagenes/teclado.png")));
            
        show_words = new JTextPane();
        show_words.setBounds(20, 30, 800, 80);
        show_words.setEditable(false);
        
        Font font = new Font("Calibri", Font.PLAIN, 28);
        show_words.setFont(font);
        show_words.setToolTipText("<html><head></head><body>"
        		+ "<b>Palabras a escribir</b><br>Las palabras aquí mostradas se generan de forma aleatoria<br>"
        		+ "</body></html>");

            
        write = new JTextArea();
        write.setBounds(300, 150, 250, 40);
        write.setFocusable(true);
        write.setBackground(Color.DARK_GRAY);
        write.setForeground(Color.WHITE);
        write.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 1));

        write.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        write.setToolTipText("Escribe las palabras");
        
        Font font2 = new Font("Calibri", Font.PLAIN, 28);
        write.setFont(font2);
        
        EventoDeTeclado tecla = new EventoDeTeclado();
        write.addKeyListener(tecla);
        
        EscuchaTexto el_evento=new EscuchaTexto();
        Document midoc=write.getDocument();
        midoc.addDocumentListener(el_evento);
        
        tiempo = new JLabel("1:00");
        
        Font font_tiempo = new Font("Calibri", Font.BOLD, 64);
        tiempo.setBounds(20, 140, 130, 100);
        tiempo.setForeground(Color.CYAN);
        tiempo.setBorder(new LineBorder(Color.WHITE, 5, true));
        tiempo.setFont(font_tiempo);
        tiempo.setToolTipText("Tiempo disponible");
        
        refrescar = new JButton();
        refrescar.setBounds(600, 150, 40, 40);
        refrescar.setBackground(Color.WHITE);
        refrescar.setBorder(new LineBorder(Color.DARK_GRAY, 2, false));
        refrescar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refrescar.setFocusable(false);
        refrescar.setIcon(new ImageIcon(TypingPro.class.getResource("/imagenes/refrescar.png")));
        refrescar.setToolTipText("Emepezar de nuevo");
        EventoEstiloRefrescar color_boton = new EventoEstiloRefrescar();
        refrescar.addMouseListener(color_boton);
        
        hud_image = new JLabel();
        hud_image.setBounds(-300, -15, 860, 400);
        
        resultados = new JPanel();
        resultados.setBounds(190, 250, 500, 80);
        resultados.setBorder(new LineBorder(Color.CYAN, 3, false));
        resultados.setBackground(Color.BLACK);
        
        Font font_r_etiquetas = new Font("Calibri", Font.BOLD, 28);
        
        eti_pal = new JLabel("Palabras:");
        eti_pal.setBounds(230, 260, 160, 25);
        eti_pal.setForeground(Color.WHITE);
        eti_pal.setFont(font_r_etiquetas);
        
        eti_pul = new JLabel("Pulsaciones:");
        eti_pul.setBounds(440, 260, 160, 25);
        eti_pul.setForeground(Color.WHITE);
        eti_pul.setFont(font_r_etiquetas);
        
        Font font_r_cantidades = new Font("Calibri", Font.BOLD, 24);
        
        num_pal_correctas = new JLabel();
        num_pal_correctas.setBounds(230, 290, 50, 25);
        num_pal_correctas.setForeground(Color.GREEN);
        num_pal_correctas.setFont(font_r_cantidades);
        
        num_pal_incorrectas = new JLabel();
        num_pal_incorrectas.setBounds(310, 290, 50, 25);
        num_pal_incorrectas.setForeground(Color.RED);
        num_pal_incorrectas.setFont(font_r_cantidades);
        
        num_pul_correctas = new JLabel();
        num_pul_correctas.setBounds(440, 290, 50, 25);
        num_pul_correctas.setForeground(Color.GREEN);
        num_pul_correctas.setFont(font_r_cantidades);
        
        num_pul_incorrectas = new JLabel();
        num_pul_incorrectas.setBounds(520, 290, 50, 25);
        num_pul_incorrectas.setForeground(Color.RED);
        num_pul_incorrectas.setFont(font_r_cantidades);
        
        n_total = new JLabel();
        n_total.setBounds(620, 290, 50, 25);
        n_total.setForeground(Color.DARK_GRAY);
        n_total.setFont(font_r_cantidades);
        
        Font font_n_ppm = new Font("Arial", Font.BOLD, 48);
        
        n_ppm = new JLabel();
        n_ppm.setBounds(700, 190, 170, 130);
        n_ppm.setForeground(Color.CYAN);
        n_ppm.setFont(font_n_ppm);
        
        Font font_ppm = new Font("Times New Roman", Font.BOLD, 24);
       
        eti_ppm = new JLabel("PPM");
        eti_ppm.setBounds(770, 250, 200, 80);
        eti_ppm.setForeground(Color.CYAN);
        eti_ppm.setFont(font_ppm);
        
        add(show_words);
        add(write);
        add(tiempo);
        add(refrescar);
        add(hud_image);
        
        add(eti_pal);
        add(eti_pul);
        add(num_pal_correctas);
        add(num_pal_incorrectas);
        add(num_pul_correctas);
        add(num_pul_incorrectas);
        add(n_total);
        add(resultados);
        add(n_ppm);
        add(eti_ppm);
        
        eti_pal.setVisible(false);
        eti_pul.setVisible(false);
        num_pal_correctas.setVisible(false);
        num_pal_incorrectas.setVisible(false);
        num_pul_correctas.setVisible(false);
        num_pul_incorrectas.setVisible(false);
        n_total.setVisible(false);
        resultados.setVisible(false);
        n_ppm.setVisible(false);
        eti_ppm.setVisible(false);
        
        getContentPane().setLayout(null);
        ((JPanel)getContentPane()).setOpaque(false);
        
        refrescar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetear();
            }
        });
        
        setVisible(true);
        
        /*try {
			playWav_welcome();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
        
        fill_initial_words();
        
    }
    
    int limit_row = 0;
    String concatenacion = "";
    int tam_row_one = 0;
    int tam_row_two = 0;
    
    public void fill_initial_words(){
        Random elige = new Random();
        
        int initial_word = elige.nextInt(871);
        
        concatenacion = words[initial_word];
        fila_uno.add(words[initial_word]);
        limit_row = words[initial_word].length();
        tam_row_one++;
        
        int complete_row = 0;
        
        for (; limit_row < 50;){
            complete_row = elige.nextInt(871);
            concatenacion += " " + words[complete_row];
            fila_uno.add(words[complete_row]);
            limit_row += words[complete_row].length();
            tam_row_one++;
        }
        
        concatenacion += "\n";
        
        limit_row = 0;
        initial_word = elige.nextInt(871);
        
        concatenacion += words[initial_word];
        fila_dos.add(words[initial_word]);
        limit_row = words[initial_word].length();
        tam_row_two++;
        
        for (; limit_row < 50;){
            complete_row = elige.nextInt(871);
            concatenacion += " " + words[complete_row];
            fila_dos.add(words[complete_row]);
            limit_row += words[complete_row].length();
            tam_row_two++;
        }
        
        show_words.setText(concatenacion);
        
        write.requestFocus();
        
        pintar_resultados = new boolean[tam_row_one];
        for(int x=0; x < tam_row_one; x++){
            pintar_resultados[x] = false;
        }
        
        minuto_contador =60;
        resaltar();
    }
    
    private class EscuchaTexto implements DocumentListener{

        @Override
        public void insertUpdate(DocumentEvent e) {
            if(comienza == true && mostrar_texto == true){
            if(codigo != 32 && write.getText().length() != 0){
                compara_texto();
            }
            }
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            if(comienza == true && mostrar_texto == true){
            if(write.getText().length() != 0){
                compara_texto();
            }else{
                highlighter.removeAllHighlights();
        
                try {
                    highlighter.addHighlight( rescata_inicio, rescata_ultimo, grayPainter);
                } catch (BadLocationException ex) {
                    Logger.getLogger(TypingPro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            }
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            
        }

}
    
    int codigo = 0;
    class EventoDeTeclado implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {
            if(e.getKeyCode() == 32){
                write.setText("");
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {
            
            if(comienza == false){
                comienza = true;
                hud_image.setIcon(new ImageIcon(TypingPro.class.getResource("/imagenes/fondo.gif")));
                
                /*try {
        			playWav_OST();
        		} catch (Exception ex) {
        			ex.printStackTrace();
        		}*/
                
                temporizadorMinuto();
            }
            
            if(comienza == true && mostrar_texto == true){
            
            codigo = e.getKeyCode();
            if(codigo == 32){   
                if(write.getText().isEmpty()){
                    
                }else{
                    compara();
                    if(posicion < tam_row_one){
                        resaltar();
                    }else{
                        recorre_genera_fila();
                    }
                }
            }
            
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            if(e.getKeyCode() == 32){
                write.setText("");
            }
           
        } 
    }
    
    int inicio = 0, ultimo = 0, posicion = 0;
    int rescata_inicio = 0, rescata_ultimo = 0;
    DefaultHighlighter highlighter;
        
    Highlighter.HighlightPainter grayPainter = new DefaultHighlighter.DefaultHighlightPainter(Color.LIGHT_GRAY);
    Highlighter.HighlightPainter redPainter = new DefaultHighlighter.DefaultHighlightPainter(Color.RED);
    public void resaltar(){
        int limit_word = fila_uno.get(posicion).length();
        ultimo = inicio + limit_word;
        rescata_ultimo = ultimo;
        highlighter = (DefaultHighlighter)show_words.getHighlighter();
        highlighter.removeAllHighlights();
        
        try {
            highlighter.addHighlight( inicio, ultimo, grayPainter );
        } catch (BadLocationException ex) {
            Logger.getLogger(TypingPro.class.getName()).log(Level.SEVERE, null, ex);
        }
        rescata_inicio = inicio;
        inicio = ultimo + 1;
        posicion++;
    }
    
    public void recorre_genera_fila(){
        
        tam_row_one = tam_row_two;
        fila_uno.removeAll(fila_uno);
        
        for(int i=0; i<tam_row_two; i++){
            fila_uno.add(fila_dos.get(i));
        }
        
        tam_row_two = 0;
        
        pintar_resultados = new boolean[tam_row_one];
        for(int x=0; x < tam_row_one; x++){
            pintar_resultados[x] = false;
        }
        
        concatenacion = fila_uno.get(0);
        
        for(int i=1; i<tam_row_one; i++){
            concatenacion += " " + fila_uno.get(i);
        }
        
        concatenacion += "\n";
        
        fila_dos.removeAll(fila_dos);
        
        Random elige2 = new Random();
        
        limit_row = 0;
        int initial_word = elige2.nextInt(871);
        
        concatenacion += words[initial_word];
        fila_dos.add(words[initial_word]);
        limit_row = words[initial_word].length();
        tam_row_two++;
        
        int complete_row = 0;
        
        for (; limit_row < 50;){
            complete_row = elige2.nextInt(871);
            concatenacion += " " + words[complete_row];
            fila_dos.add(words[complete_row]);
            limit_row += words[complete_row].length();
            tam_row_two++;
        }
        
        show_words.setText(concatenacion);
        
        inicio = 0;
        ultimo = 0;
        posicion = 0;
        rescata_inicio = 0;
        rescata_ultimo = 0;
        
        resaltar();
    }
    
    String mi_texto = "";
    String el_texto = "";
    boolean va_igual = true;
    boolean espacio_inicial = false;
    public void compara_texto(){
        mi_texto = write.getText();
        el_texto = fila_uno.get(posicion-1);
        
        char []descompone_mi_texto = mi_texto.toCharArray();
        char []descompone_el_texto = el_texto.toCharArray();
        
        int longitud_mi_texto = descompone_mi_texto.length;
        int longitud_el_texto = descompone_el_texto.length;
        
        if(descompone_mi_texto[0] == ' '){
            espacio_inicial = true;
        }
        
        if(espacio_inicial == false){
            for(int x = 0; x < longitud_mi_texto; x++){
                if(longitud_mi_texto <= longitud_el_texto){
                    if(descompone_mi_texto[x] != descompone_el_texto[x]){
                        va_igual = false;
                    }
                }else{
                    va_igual = false;
                }
            }
        }else{
            for(int x = 1; x < longitud_mi_texto; x++){
                if(longitud_mi_texto-1 <= longitud_el_texto){
                    if(descompone_mi_texto[x] != descompone_el_texto[x-1]){
                        va_igual = false;
                    }
                }else{
                    va_igual = false;
                }
            }
        }
        
        if(va_igual == false){
            highlighter.removeAllHighlights();
        
            try {
                highlighter.addHighlight( rescata_inicio, rescata_ultimo, redPainter);
            } catch (BadLocationException ex) {
                Logger.getLogger(TypingPro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            highlighter.removeAllHighlights();
            
            try {
              highlighter.addHighlight( rescata_inicio, rescata_ultimo, grayPainter);
            } catch (BadLocationException ex) {
                Logger.getLogger(TypingPro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        va_igual = true;
        espacio_inicial = false;
    }
    
    int contador_correctas = 0;
    int contador_incorrectas = 0;
    int contador_pulsaciones_correctas = 0;
    int contador_pulsaciones_incorrectas = 0;
    public void compara(){
        if(write.getText().equals(fila_uno.get(posicion-1)) || write.getText().equals(" " + fila_uno.get(posicion-1))){
            contador_correctas++;
            contador_pulsaciones_correctas += write.getText().length() +1;
            colores_palabras(true);
        }else{
            
        	/*try {
				playWav_incorrects();
			} catch (Exception e) {
				e.printStackTrace();
			}*/
        	
            contador_incorrectas++;
            contador_pulsaciones_incorrectas += write.getText().length() +1;
            colores_palabras(false);
        }
    }
    
    boolean pintar_resultados [];
    public void colores_palabras(boolean mi_resultado){
        pintar_resultados[posicion-1] = mi_resultado;
        
        StyledDocument doc = show_words.getStyledDocument();
        Style style = show_words.addStyle("I'm a Style", null);
        
        show_words.setText("");
        
        int x=0;
        
        for(; x<posicion; x++){
            if(x < tam_row_one-1){
                if(pintar_resultados[x] == true){
                    StyleConstants.setForeground(style, Color.GREEN);
                    try{
                        doc.insertString(doc.getLength(), fila_uno.get(x) + " ",style); }
                    catch (BadLocationException e){}
                }else{
                    StyleConstants.setForeground(style, Color.RED);
                    try{
                        doc.insertString(doc.getLength(), fila_uno.get(x) + " ",style); }
                    catch (BadLocationException e){}
                }
            }
        }
        
        for(; x < tam_row_one; x++){
            if(x == tam_row_one-1){
                StyleConstants.setForeground(style, Color.BLACK);
                    try{
                        doc.insertString(doc.getLength(), fila_uno.get(x) + "\n",style); }
                    catch (BadLocationException e){}
            }else{
                StyleConstants.setForeground(style, Color.BLACK);
                    try{
                        doc.insertString(doc.getLength(), fila_uno.get(x) + " ",style); }
                    catch (BadLocationException e){}
            }
        }
        
        x=0;
        
        for(; x < tam_row_two; x++){
            if(x == tam_row_two-1){
                StyleConstants.setForeground(style, Color.BLACK);
                    try{
                        doc.insertString(doc.getLength(), fila_dos.get(x),style); }
                    catch (BadLocationException e){}
            }else{
                StyleConstants.setForeground(style, Color.BLACK);
                    try{
                        doc.insertString(doc.getLength(), fila_dos.get(x) + " ",style); }
                    catch (BadLocationException e){}
            }
        }
    }
    
    //SONIDOS UTILIZADOSS EN EL SISTEMA
    /*public void playWav_welcome() throws Exception {
    	InputStream is = TypingPro.class.getResourceAsStream("/sonidos/Beep_Future_Computing_05.wav");
        AudioInputStream ais = AudioSystem.getAudioInputStream(is);

        Clip clip = AudioSystem.getClip();
        clip.open(ais);

        clip.start();

    }
    
    
    public void playWav_incorrects() throws Exception {
    	InputStream is = TypingPro.class.getResourceAsStream("/sonidos/Beep_Tech_04.wav");
        AudioInputStream ais = AudioSystem.getAudioInputStream(is);

        Clip clip = AudioSystem.getClip();
        clip.open(ais);

        clip.start();

    }
    
    public void playWav_hurryup() throws Exception {
    	InputStream is = TypingPro.class.getResourceAsStream("/sonidos/Beep_Tech_01.wav");
        AudioInputStream ais = AudioSystem.getAudioInputStream(is);

        Clip clip = AudioSystem.getClip();
        clip.open(ais);

        clip.start();

    }
    
    public void playWav_finished() throws Exception {
    	InputStream is = TypingPro.class.getResourceAsStream("/sonidos/Beep_Computer_03.wav");
        AudioInputStream ais = AudioSystem.getAudioInputStream(is);

        Clip clip = AudioSystem.getClip();
        clip.open(ais);

        clip.start();

    }
    
    
    Clip clip_OST;
    public void playWav_OST() throws Exception {
    	InputStream is = TypingPro.class.getResourceAsStream("/sonidos/OST.wav");
        AudioInputStream ais = AudioSystem.getAudioInputStream(is);

        clip_OST = AudioSystem.getClip();
        clip_OST.open(ais);

        clip_OST.start();
        

    }*/

    
    boolean comienza = false;
    int minuto_contador = 60;
    final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    public void temporizadorMinuto(){

        final Runnable runnable = new Runnable() {
            
            @Override
            public void run() {
                
                if(minuto_contador != 60){
                    if(minuto_contador > 9){
                        tiempo.setText("0:" + minuto_contador);
                    }else{
                    	//SONIDO DE TIEMPO AGOTÁNDOSE
                    	/*try {
            				playWav_hurryup();
            			} catch (Exception e) {
            				e.printStackTrace();
            			}*/
                    	
                        tiempo.setForeground(Color.RED);
                        tiempo.setBorder(new LineBorder(Color.RED, 5, true));
                        tiempo.setText("0:0" + minuto_contador);
                    }
                }else{
                    tiempo.setText("1:00");
                }
                
                minuto_contador--;

                if (minuto_contador < 0) {
                    scheduler.shutdown();
                    scheduler.isTerminated();
                    scheduler.isShutdown();
                    minuto_contador = 60;
                    show_words.setBackground(Color.DARK_GRAY);
                    hud_image.setVisible(false);
                    mostrar_texto = false;
                    resultados();
                }
            }
        };
        scheduler.scheduleAtFixedRate(runnable, 0, 1, SECONDS);
    }
    
    public void resultados(){
    	//SONIDO DE FIN Y MOSTRAR RESULTADOS
    	/*try {
			playWav_finished();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
    	
        if(contador_incorrectas > 10){
            JOptionPane.showMessageDialog(rootPane, "Se cometieron " + contador_incorrectas + " errores", "Demasiados errores", JOptionPane.INFORMATION_MESSAGE);
        }
        int total = 0;
        total = contador_pulsaciones_correctas + contador_pulsaciones_incorrectas;
        
        //OBTENEMOS LA MEDIA DE NUESTRA VELOCIDAD
        double ppm = contador_pulsaciones_correctas / 6.31;
        String ppm_final = String.format("%.2f", ppm);
        
        eti_pal.setVisible(true);
        eti_pul.setVisible(true);
        num_pal_correctas.setVisible(true);
        num_pal_incorrectas.setVisible(true);
        num_pul_correctas.setVisible(true);
        num_pul_incorrectas.setVisible(true);
        n_total.setVisible(true);
        resultados.setVisible(true);
        n_ppm.setVisible(true);
        eti_ppm.setVisible(true);
        
        num_pal_correctas.setText(contador_correctas + "");
        num_pal_incorrectas.setText(contador_incorrectas + "");
        num_pul_correctas.setText(contador_pulsaciones_correctas + "");
        num_pul_incorrectas.setText(contador_pulsaciones_incorrectas + "");
        n_total.setText(total + "");
        n_ppm.setText(ppm_final);
    }
    
    
    
    public static void main(String[] args) {
        TypingPro obj = new TypingPro();
    }
    
    
    boolean mostrar_texto = true;
    public void resetear(){
        if(comienza == true){
            scheduler.shutdown();
        }
        
        /*if(clip_OST.isRunning()) {
        	clip_OST.close();
        }*/
        
        TypingPro abrir = new TypingPro();
        abrir.setVisible(true);
        dispose();
    }
    
    
    class EventoEstiloRefrescar implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            
        }

        @Override
        public void mousePressed(MouseEvent e) {
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        	refrescar.setBackground(Color.CYAN);
            refrescar.setBorder(new LineBorder(Color.CYAN, 2, false));
        }

        @Override
        public void mouseExited(MouseEvent e) {
        	refrescar.setBackground(Color.WHITE);
            refrescar.setBorder(new LineBorder(Color.DARK_GRAY, 2, false));
        }
    }
}
