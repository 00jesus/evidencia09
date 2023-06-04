# Evidencia 09
*******
Clases identificadas :
+ Juego
  + Calculadora ----> dependencia a Juego
  + Dado ------------> agregacion a Juego

Entre el el Juego y la Calculadora solo habra una relacion de dependencia
ya que su unica interaccion con ella, sera la solicitud de uso de uno de sus metodos,
el de sumar

Entre la clase Juego y Dado habra una relacion mas fuerte, de agregacion, ya que
el dado forma parte de Juego, pero si juego desaparece, Dado sigue existiendo,
aunque pierde funcionalidad, al perderse su contexto (Sin embargo podria ser
utilizado en otro juego, por lo que no muere).