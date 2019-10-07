package com.chilecompra.springboot.backend.apirest.models.services;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Path;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface IUploadFileService {

	public Resource cargar(String nombreFoto) throws MalformedURLException; //cargar el resource
	public String copiar(MultipartFile archivo) throws IOException; //agregarla al directorio
	public boolean eliminar(String nombreFoto); //para eliminar el archivo
	public Path getPath(String nombreFoto); //obtener la ruta del archivo
}
