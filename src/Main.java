import business.*;

public class Main {

    public static void main(String args[]) {
        Farmacia farmacia = new Farmacia();


        Tratamiento tratamiento1 = new Tratamiento("Inyección", 2500);
        Tratamiento tratamiento2 = new Tratamiento("Toma de presión", 1500);
        Tratamiento tratamiento3 = new Tratamiento("Control de glucosa", 2000);
        Tratamiento tratamiento4 = new Tratamiento("Chequeo general", 3500);
        Tratamiento tratamiento5 = new Tratamiento("Curación de herida", 1800);
        Tratamiento tratamiento6 = new Tratamiento("Limpieza dental", 4500);
        Tratamiento tratamiento7 = new Tratamiento("Revisión ocular", 2200);
        Tratamiento tratamiento8 = new Tratamiento("Consulta médica general", 4000);
        Tratamiento tratamiento9 = new Tratamiento("Fisioterapia", 3800);
        Tratamiento tratamiento10 = new Tratamiento("Nebulización", 1700);
        Tratamiento tratamiento11 = new Tratamiento("Aplicación de suero", 2500);
        Tratamiento tratamiento12 = new Tratamiento("Electrocardiograma", 5000);
        Tratamiento tratamiento13 = new Tratamiento("Vacunación", 1200);
        Tratamiento tratamiento14 = new Tratamiento("Curación postoperatoria", 3000);
        Tratamiento tratamiento15 = new Tratamiento("Masaje terapéutico", 3500);
        Tratamiento tratamiento16 = new Tratamiento("Terapia respiratoria", 2800);
        Tratamiento tratamiento17 = new Tratamiento("Consulta odontológica", 4500);
        Tratamiento tratamiento18 = new Tratamiento("Control prenatal", 3700);
        Tratamiento tratamiento19 = new Tratamiento("Examen de colesterol", 2200);
        Tratamiento tratamiento20 = new Tratamiento("Examen de triglicéridos", 2300);
        Tratamiento tratamiento21 = new Tratamiento("Limpieza facial", 3000);
        Tratamiento tratamiento22 = new Tratamiento("Aplicación de vacuna antigripal", 1000);
        Tratamiento tratamiento23 = new Tratamiento("Revisión auditiva", 2600);
        Tratamiento tratamiento24 = new Tratamiento("Consulta pediátrica", 3200);
        Tratamiento tratamiento25 = new Tratamiento("Consulta dermatológica", 3300);
        Tratamiento tratamiento26 = new Tratamiento("Examen de tiroides", 2700);
        Tratamiento tratamiento27 = new Tratamiento("Medición de glucosa capilar", 1800);
        Tratamiento tratamiento28 = new Tratamiento("Lavado de oído", 1200);
        Tratamiento tratamiento29 = new Tratamiento("Sutura de herida", 4000);
        Tratamiento tratamiento30 = new Tratamiento("Retiro de puntos", 1500);
        Tratamiento tratamiento31 = new Tratamiento("Consulta nutricional", 3500);
        Tratamiento tratamiento32 = new Tratamiento("Consulta psicológica", 3800);
        Tratamiento tratamiento33 = new Tratamiento("Chequeo ginecológico", 4200);
        Tratamiento tratamiento34 = new Tratamiento("Terapia ocupacional", 3100);
        Tratamiento tratamiento35 = new Tratamiento("Control de peso", 2000);
        Tratamiento tratamiento36 = new Tratamiento("Evaluación física", 2800);
        Tratamiento tratamiento37 = new Tratamiento("Terapia de lenguaje", 3400);
        Tratamiento tratamiento38 = new Tratamiento("Consulta cardiológica", 5000);
        Tratamiento tratamiento39 = new Tratamiento("Control oftalmológico", 3700);
        Tratamiento tratamiento40 = new Tratamiento("Consulta traumatológica", 4100);
        Tratamiento tratamiento41 = new Tratamiento("Terapia de rehabilitación", 4500);
        Tratamiento tratamiento42 = new Tratamiento("Consulta neurológica", 4800);
        Tratamiento tratamiento43 = new Tratamiento("Sesión de acupuntura", 3900);
        Tratamiento tratamiento44 = new Tratamiento("Análisis de orina", 1900);
        Tratamiento tratamiento45 = new Tratamiento("Examen de sangre completo", 2500);
        Tratamiento tratamiento46 = new Tratamiento("Consulta de control", 2200);
        Tratamiento tratamiento47 = new Tratamiento("Terapia de relajación", 3200);
        Tratamiento tratamiento48 = new Tratamiento("Consulta endocrinológica", 4400);
        Tratamiento tratamiento49 = new Tratamiento("Terapia postoperatoria", 3700);
        Tratamiento tratamiento50 = new Tratamiento("Examen auditivo", 2100);


        Medicamento medicamento1 = new Medicamento("Paracetamol", 500, "Tomar cada 8h", 30);
        Medicamento medicamento2 = new Medicamento("Amoxicilina", 800, "Tomar cada 12h", 20);
        Medicamento medicamento3 = new Medicamento("Ungüento antibacterial", 1200, "Aplicar en zona afectada", 10);
        Medicamento medicamento4 = new Medicamento("Ibuprofeno", 700, "Tomar cada 6h", 25);
        Medicamento medicamento5 = new Medicamento("Omeprazol", 600, "Tomar en ayunas", 15);
        Medicamento medicamento6 = new Medicamento("Vitamina C", 400, "Una tableta diaria", 40);
        Medicamento medicamento7 = new Medicamento("Loratadina", 550, "Tomar una vez al día", 35);
        Medicamento medicamento8 = new Medicamento("Cefalexina", 900, "Cada 12h por 7 días", 10);
        Medicamento medicamento9 = new Medicamento("Acetaminofén", 500, "Cada 8h", 50);
        Medicamento medicamento10 = new Medicamento("Diclofenaco", 750, "Cada 12h después de comer", 20);
        Medicamento medicamento11 = new Medicamento("Metformina", 850, "Tomar con las comidas", 30);
        Medicamento medicamento12 = new Medicamento("Losartán", 950, "Una diaria", 25);
        Medicamento medicamento13 = new Medicamento("Simvastatina", 1000, "Antes de dormir", 20);
        Medicamento medicamento14 = new Medicamento("Prednisona", 600, "Cada 24h", 15);
        Medicamento medicamento15 = new Medicamento("Aspirina", 400, "Cada 12h", 50);
        Medicamento medicamento16 = new Medicamento("Salbutamol", 700, "Inhalar cada 6h si hay crisis", 15);
        Medicamento medicamento17 = new Medicamento("Clorfenamina", 500, "Cada 8h", 20);
        Medicamento medicamento18 = new Medicamento("Hidrocortisona", 1200, "Aplicar dos veces al día", 10);
        Medicamento medicamento19 = new Medicamento("Naproxeno", 850, "Cada 12h con comida", 30);
        Medicamento medicamento20 = new Medicamento("Ketorolaco", 950, "Cada 8h máximo 5 días", 15);
        Medicamento medicamento21 = new Medicamento("Miconazol", 1100, "Aplicar en la zona afectada", 12);
        Medicamento medicamento22 = new Medicamento("Ranitidina", 700, "Tomar antes de comer", 25);
        Medicamento medicamento23 = new Medicamento("Azitromicina", 950, "Una cada 24h por 3 días", 10);
        Medicamento medicamento24 = new Medicamento("Clotrimazol", 800, "Aplicar dos veces al día", 18);
        Medicamento medicamento25 = new Medicamento("Furosemida", 600, "Tomar en la mañana", 20);
        Medicamento medicamento26 = new Medicamento("Insulina", 2500, "Inyectar según control médico", 8);
        Medicamento medicamento27 = new Medicamento("Levotiroxina", 900, "En ayunas cada mañana", 25);
        Medicamento medicamento28 = new Medicamento("Amiodarona", 1100, "Cada 24h", 12);
        Medicamento medicamento29 = new Medicamento("Captopril", 650, "Cada 12h", 30);
        Medicamento medicamento30 = new Medicamento("Dexametasona", 750, "Cada 12h", 15);
        Medicamento medicamento31 = new Medicamento("Amlodipina", 850, "Una diaria", 25);
        Medicamento medicamento32 = new Medicamento("Glibenclamida", 800, "Cada 12h con comida", 30);
        Medicamento medicamento33 = new Medicamento("Ketoconazol", 1200, "Aplicar o tomar según indicación", 10);
        Medicamento medicamento34 = new Medicamento("Eritromicina", 950, "Cada 6h por 5 días", 10);
        Medicamento medicamento35 = new Medicamento("Aciclovir", 1000, "Cada 8h", 15);
        Medicamento medicamento36 = new Medicamento("Montelukast", 950, "Tomar una diaria", 20);
        Medicamento medicamento37 = new Medicamento("Clonazepam", 1200, "Tomar antes de dormir", 10);
        Medicamento medicamento38 = new Medicamento("Ciprofloxacina", 1000, "Cada 12h por 5 días", 12);
        Medicamento medicamento39 = new Medicamento("Tetraciclina", 900, "Cada 8h", 15);
        Medicamento medicamento40 = new Medicamento("Nistatina", 1100, "Aplicar 3 veces al día", 10);
        Medicamento medicamento41 = new Medicamento("Betametasona", 1200, "Aplicar dos veces al día", 8);
        Medicamento medicamento42 = new Medicamento("Fenitoína", 950, "Cada 12h", 15);
        Medicamento medicamento43 = new Medicamento("Metronidazol", 850, "Cada 8h", 20);
        Medicamento medicamento44 = new Medicamento("Sertralina", 950, "Una diaria", 25);
        Medicamento medicamento45 = new Medicamento("Diazepam", 1000, "Antes de dormir", 10);
        Medicamento medicamento46 = new Medicamento("Folic Acid", 650, "Una diaria", 30);
        Medicamento medicamento47 = new Medicamento("Hierro", 700, "Tomar después de comer", 40);
        Medicamento medicamento48 = new Medicamento("Calcio + Vitamina D", 900, "Tomar dos veces al día", 25);
        Medicamento medicamento49 = new Medicamento("Melatonina", 800, "Tomar antes de dormir", 20);
        Medicamento medicamento50 = new Medicamento("Benzocaína", 1000, "Aplicar en área afectada", 10);


        farmacia.getCatalogo().insertar(medicamento1.getId(), medicamento1);
        farmacia.getCatalogo().insertar(medicamento2.getId(), medicamento2);
        farmacia.getCatalogo().insertar(medicamento3.getId(), medicamento3);
        farmacia.getCatalogo().insertar(medicamento4.getId(), medicamento4);
        farmacia.getCatalogo().insertar(medicamento5.getId(), medicamento5);
        farmacia.getCatalogo().insertar(medicamento6.getId(), medicamento6);
        farmacia.getCatalogo().insertar(medicamento7.getId(), medicamento7);
        farmacia.getCatalogo().insertar(medicamento8.getId(), medicamento8);
        farmacia.getCatalogo().insertar(medicamento9.getId(), medicamento9);
        farmacia.getCatalogo().insertar(medicamento10.getId(), medicamento10);
        farmacia.getCatalogo().insertar(medicamento11.getId(), medicamento11);
        farmacia.getCatalogo().insertar(medicamento12.getId(), medicamento12);
        farmacia.getCatalogo().insertar(medicamento13.getId(), medicamento13);
        farmacia.getCatalogo().insertar(medicamento14.getId(), medicamento14);
        farmacia.getCatalogo().insertar(medicamento15.getId(), medicamento15);
        farmacia.getCatalogo().insertar(medicamento16.getId(), medicamento16);
        farmacia.getCatalogo().insertar(medicamento17.getId(), medicamento17);
        farmacia.getCatalogo().insertar(medicamento18.getId(), medicamento18);
        farmacia.getCatalogo().insertar(medicamento19.getId(), medicamento19);
        farmacia.getCatalogo().insertar(medicamento20.getId(), medicamento20);
        farmacia.getCatalogo().insertar(medicamento21.getId(), medicamento21);
        farmacia.getCatalogo().insertar(medicamento22.getId(), medicamento22);
        farmacia.getCatalogo().insertar(medicamento23.getId(), medicamento23);
        farmacia.getCatalogo().insertar(medicamento24.getId(), medicamento24);
        farmacia.getCatalogo().insertar(medicamento25.getId(), medicamento25);
        farmacia.getCatalogo().insertar(medicamento26.getId(), medicamento26);
        farmacia.getCatalogo().insertar(medicamento27.getId(), medicamento27);
        farmacia.getCatalogo().insertar(medicamento28.getId(), medicamento28);
        farmacia.getCatalogo().insertar(medicamento29.getId(), medicamento29);
        farmacia.getCatalogo().insertar(medicamento30.getId(), medicamento30);
        farmacia.getCatalogo().insertar(medicamento31.getId(), medicamento31);
        farmacia.getCatalogo().insertar(medicamento32.getId(), medicamento32);
        farmacia.getCatalogo().insertar(medicamento33.getId(), medicamento33);
        farmacia.getCatalogo().insertar(medicamento34.getId(), medicamento34);
        farmacia.getCatalogo().insertar(medicamento35.getId(), medicamento35);
        farmacia.getCatalogo().insertar(medicamento36.getId(), medicamento36);
        farmacia.getCatalogo().insertar(medicamento37.getId(), medicamento37);
        farmacia.getCatalogo().insertar(medicamento38.getId(), medicamento38);
        farmacia.getCatalogo().insertar(medicamento39.getId(), medicamento39);
        farmacia.getCatalogo().insertar(medicamento40.getId(), medicamento40);
        farmacia.getCatalogo().insertar(medicamento41.getId(), medicamento41);
        farmacia.getCatalogo().insertar(medicamento42.getId(), medicamento42);
        farmacia.getCatalogo().insertar(medicamento43.getId(), medicamento43);
        farmacia.getCatalogo().insertar(medicamento44.getId(), medicamento44);
        farmacia.getCatalogo().insertar(medicamento45.getId(), medicamento45);
        farmacia.getCatalogo().insertar(medicamento46.getId(), medicamento46);
        farmacia.getCatalogo().insertar(medicamento47.getId(), medicamento47);
        farmacia.getCatalogo().insertar(medicamento48.getId(), medicamento48);
        farmacia.getCatalogo().insertar(medicamento49.getId(), medicamento49);
        farmacia.getCatalogo().insertar(medicamento50.getId(), medicamento50);


        farmacia.getCatalogo().insertar(tratamiento1.getId(), tratamiento1);
        farmacia.getCatalogo().insertar(tratamiento2.getId(), tratamiento2);
        farmacia.getCatalogo().insertar(tratamiento3.getId(), tratamiento3);
        farmacia.getCatalogo().insertar(tratamiento4.getId(), tratamiento4);
        farmacia.getCatalogo().insertar(tratamiento5.getId(), tratamiento5);
        farmacia.getCatalogo().insertar(tratamiento6.getId(), tratamiento6);
        farmacia.getCatalogo().insertar(tratamiento7.getId(), tratamiento7);
        farmacia.getCatalogo().insertar(tratamiento8.getId(), tratamiento8);
        farmacia.getCatalogo().insertar(tratamiento9.getId(), tratamiento9);
        farmacia.getCatalogo().insertar(tratamiento10.getId(), tratamiento10);
        farmacia.getCatalogo().insertar(tratamiento11.getId(), tratamiento11);
        farmacia.getCatalogo().insertar(tratamiento12.getId(), tratamiento12);
        farmacia.getCatalogo().insertar(tratamiento13.getId(), tratamiento13);
        farmacia.getCatalogo().insertar(tratamiento14.getId(), tratamiento14);
        farmacia.getCatalogo().insertar(tratamiento15.getId(), tratamiento15);
        farmacia.getCatalogo().insertar(tratamiento16.getId(), tratamiento16);
        farmacia.getCatalogo().insertar(tratamiento17.getId(), tratamiento17);
        farmacia.getCatalogo().insertar(tratamiento18.getId(), tratamiento18);
        farmacia.getCatalogo().insertar(tratamiento19.getId(), tratamiento19);
        farmacia.getCatalogo().insertar(tratamiento20.getId(), tratamiento20);
        farmacia.getCatalogo().insertar(tratamiento21.getId(), tratamiento21);
        farmacia.getCatalogo().insertar(tratamiento22.getId(), tratamiento22);
        farmacia.getCatalogo().insertar(tratamiento23.getId(), tratamiento23);
        farmacia.getCatalogo().insertar(tratamiento24.getId(), tratamiento24);
        farmacia.getCatalogo().insertar(tratamiento25.getId(), tratamiento25);
        farmacia.getCatalogo().insertar(tratamiento26.getId(), tratamiento26);
        farmacia.getCatalogo().insertar(tratamiento27.getId(), tratamiento27);
        farmacia.getCatalogo().insertar(tratamiento28.getId(), tratamiento28);
        farmacia.getCatalogo().insertar(tratamiento29.getId(), tratamiento29);
        farmacia.getCatalogo().insertar(tratamiento30.getId(), tratamiento30);
        farmacia.getCatalogo().insertar(tratamiento31.getId(), tratamiento31);
        farmacia.getCatalogo().insertar(tratamiento32.getId(), tratamiento32);
        farmacia.getCatalogo().insertar(tratamiento33.getId(), tratamiento33);
        farmacia.getCatalogo().insertar(tratamiento34.getId(), tratamiento34);
        farmacia.getCatalogo().insertar(tratamiento35.getId(), tratamiento35);
        farmacia.getCatalogo().insertar(tratamiento36.getId(), tratamiento36);
        farmacia.getCatalogo().insertar(tratamiento37.getId(), tratamiento37);
        farmacia.getCatalogo().insertar(tratamiento38.getId(), tratamiento38);
        farmacia.getCatalogo().insertar(tratamiento39.getId(), tratamiento39);
        farmacia.getCatalogo().insertar(tratamiento40.getId(), tratamiento40);
        farmacia.getCatalogo().insertar(tratamiento41.getId(), tratamiento41);
        farmacia.getCatalogo().insertar(tratamiento42.getId(), tratamiento42);
        farmacia.getCatalogo().insertar(tratamiento43.getId(), tratamiento43);
        farmacia.getCatalogo().insertar(tratamiento44.getId(), tratamiento44);
        farmacia.getCatalogo().insertar(tratamiento45.getId(), tratamiento45);
        farmacia.getCatalogo().insertar(tratamiento46.getId(), tratamiento46);
        farmacia.getCatalogo().insertar(tratamiento47.getId(), tratamiento47);
        farmacia.getCatalogo().insertar(tratamiento48.getId(), tratamiento48);
        farmacia.getCatalogo().insertar(tratamiento49.getId(), tratamiento49);
        farmacia.getCatalogo().insertar(tratamiento50.getId(), tratamiento50);



        Cliente c1 = new Cliente("Ana Gómez", "101010101", false);
        Cliente c2 = new Cliente("Luis Mora", "202020202", true);
        Cliente c3 = new Cliente("María Pérez", "303030303", false);
        Cliente c4 = new Cliente("Carlos Vargas", "404040404", true);

        Servicio s1 = (Servicio) farmacia.getCatalogo().buscar(50).getValor();
        Servicio s2 = (Servicio) farmacia.getCatalogo().buscar(43).getValor();
        Nodo nodo;
        nodo = farmacia.getClientes().getPrimero();
        do{
            ((Cliente)nodo.getValor()).getServicios().insertar(s1);
            ((Cliente)nodo.getValor()).getServicios().insertar(s2);
            nodo = nodo.getSiguiente();
        }while(nodo.getSiguiente() != null);

        farmacia.getClientes().insertar(c1);
        farmacia.getClientes().insertar(c2);
        farmacia.getClientes().insertar(c3);
        farmacia.getClientes().insertar(c4);



    }
}


