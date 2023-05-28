import xml.etree.ElementTree as ET
from reportlab.pdfgen import canvas

# Pedir al usuario que ingrese la ruta del archivo XML
xml_path = input("Ingresa la ruta del archivo XML: ")

# Analizar el archivo XML y obtener su contenido
tree = ET.parse(xml_path)
root = tree.getroot()

# Crear un archivo PDF con un tamaño de 1920x1080 píxeles
pdf_path = "contenido.pdf"
c = canvas.Canvas(pdf_path, pagesize=(1920, 1080))

# Dar formato al contenido del archivo XML y agregarlo al archivo PDF
y = 950  # Posición inicial del texto en el eje y
for child in root:
    texto = child.tag + ": " + child.text  # Formato del texto
    c.drawString(100, y, texto)  # Agregar el texto al archivo PDF
    y -= 30  # Desplazar el texto hacia arriba

# Guardar y cerrar el archivo PDF
c.save()

print("Se ha generado el archivo PDF correctamente.")