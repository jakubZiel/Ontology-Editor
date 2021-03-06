package com.rdfsonto.rdfsonto.service.rdf4j.download;

import com.rdfsonto.rdfsonto.service.rdf4j.export.RDF4JInputOutput;
import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Statement;
import org.eclipse.rdf4j.model.Value;
import org.eclipse.rdf4j.rio.RDFFormat;
import org.eclipse.rdf4j.rio.RDFHandler;
import org.eclipse.rdf4j.rio.RDFHandlerException;

public class RDF4JStreamLoad extends RDF4JInputOutput implements RDFHandler {
    public RDF4JStreamLoad(RDFFormat dataFormat) {
        super(dataFormat);
    }

    @Override
    protected IRI handlePredicate(IRI predicate) {
        return null;
    }

    @Override
    protected IRI handleSubject(IRI subject) {
        return null;
    }

    @Override
    protected Value handleObject(Value object) {
        return null;
    }

    @Override
    public void startRDF() throws RDFHandlerException {

    }

    @Override
    public void endRDF() throws RDFHandlerException {

    }

    @Override
    public void handleNamespace(String prefix, String uri) throws RDFHandlerException {

    }

    @Override
    public void handleStatement(Statement st) throws RDFHandlerException {

    }

    @Override
    public void handleComment(String comment) throws RDFHandlerException {

    }
}
