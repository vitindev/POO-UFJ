package com.vitindev.jobs.two.view;

import com.vitindev.jobs.two.dao.ModelDAO;
import com.vitindev.jobs.two.model.Author;
import com.vitindev.jobs.two.model.Model;
import com.vitindev.jobs.two.model.Publisher;
import com.vitindev.jobs.two.model.Work;
import javafx.application.Application;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.util.StringConverter;

public class ModelView extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private final ModelDAO modelDAO = new ModelDAO();
    private final TableView<Model> table = new TableView<>();

    private final ObservableList<Model> originalData = FXCollections.observableArrayList(modelDAO.getModels());
    private final FilteredList<Model> filteredData = new FilteredList<>(originalData, predicate -> true);

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Biblioteca - Cadastro de Livros - Exemplares");

        /*
         * Vai organizar os componentes em grade, com seus espaçamentos corretos (horizontal e vertical)
         *  */
        final var grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);

        /*
         * Adiciona um componente para digitar o exemplar
         * */
        final var labelModel = new Label("Exemplar:");
        final var fieldModel = new TextField();
        grid.add(labelModel, 0, 0);
        grid.add(fieldModel, 1, 0);

        /*
         * Adiciona um componente para digitar o titulo
         * */
        final var labelTitle = new Label("Titulo:");
        final var fieldTitle = new TextField();
        grid.add(labelTitle, 0, 1);
        grid.add(fieldTitle, 1, 1);

        /*
         * Adiciona um componente para selecionar o Autor
         * */
        final var labelAuthor = new Label("Autor:");
        final var comboBoxAuthor = new ComboBox<>(FXCollections.observableArrayList(
                new Author(1, "VitinDev"),
                new Author(2, "DevBruna"),
                new Author(3, "SafadãoCodes")
        ));
        comboBoxAuthor.setConverter(new StringConverter<>() {

            @Override
            public String toString(Author author) {
                return author != null ? author.getName() : "";
            }

            @Override
            public Author fromString(String string) {
                return comboBoxAuthor.getItems().stream()
                        .filter(author -> author.getName().equals(string))
                        .findFirst()
                        .orElse(null);
            }

        });
        grid.add(labelAuthor, 0, 2);
        grid.add(comboBoxAuthor, 1, 2);

        /*
         * Adiciona um componente para selecionar a Editora
         * */
        final var labelPublisher = new Label("Editora:");
        final var comboBoxPublisher = new ComboBox<>(FXCollections.observableArrayList(
                new Publisher(1, "JavaEditors", "Capitão Serafim de Barros"),
                new Publisher(2, "InvaEdition", "Mooca"),
                new Publisher(3, "Quimera", "Santa Luzia"),
                new Publisher(4, "WillAndWill", "Rua dos alfaiates")
        ));
        comboBoxPublisher.setConverter(new StringConverter<>() {

            @Override
            public String toString(Publisher publisher) {
                return publisher != null ? publisher.getName() : "";
            }

            @Override
            public Publisher fromString(String string) {
                return comboBoxPublisher.getItems().stream()
                        .filter(publisher -> publisher.getName().equals(string))
                        .findFirst()
                        .orElse(null);
            }

        });
        grid.add(labelPublisher, 0, 3);
        grid.add(comboBoxPublisher, 1, 3);

        /*
         * Adiciona um componente para digitar a Edição
         * */
        final var labelEdition = new Label("Edição:");
        final var fieldEdition = new TextField();
        grid.add(labelEdition, 0, 4);
        grid.add(fieldEdition, 1, 4);

        /*
         * Adiciona um componente para digitar o Ano de lançamento
         * */
        final var labelYear = new Label("Ano:");
        final var fieldYear = new TextField();
        grid.add(labelYear, 0, 5);
        grid.add(fieldYear, 1, 5);

        /*
         * Botão para salvar o que foi selecionado / digitado
         * */
        final var buttonSave = new Button("Salvar");
        buttonSave.setOnAction(e -> save(fieldModel, fieldTitle, comboBoxAuthor, comboBoxPublisher, fieldEdition, fieldYear));
        grid.add(buttonSave, 0, 6);

        setupTableView();

        /*
         * Adiciona um campo de busca
         * */
        final var searchField = new TextField();
        searchField.setPromptText("Buscar titulo...");

        /*
         * Filtro para o campo de busca
         * */
        searchField.textProperty().addListener((observable, oldValue, newValue) -> filteredData.setPredicate(model -> {

            if (newValue == null || newValue.isEmpty())
                return true;

            final var lowerCaseFilter = newValue.toLowerCase();

            if (model.getWork().getTitle().toLowerCase().contains(lowerCaseFilter)) {
                return true;
            } else if (String.valueOf(model.getCode()).contains(lowerCaseFilter)) {
                return true;
            } else if (model.getWork().getAuthor().getName().toLowerCase().contains(lowerCaseFilter)) {
                return true;
            } else if (model.getWork().getPublisher().getName().toLowerCase().contains(lowerCaseFilter)) {
                return true;
            }

            return false;
        }));

        table.setItems(filteredData);

        /*
         * Component para adicionar imagem ao lado do grid
         * */
        final var imageView = new ImageView(new Image(getClass().getResourceAsStream("/image.png"))); // Atualize o caminho da imagem
        imageView.setFitHeight(200); // Ajuste a altura da imagem
        imageView.setPreserveRatio(true); // Preserva a proporção da imagem

        /*
         * Criando um component para organizar tudo junto no layout
         * */
        final var vBox = new VBox(10, grid, searchField, table); // O campo de busca acima da tabela

        /*
         * Componente para organizar o layout junto com a imagem
         * */
        final var borderPane = new BorderPane();
        borderPane.setCenter(vBox);
        borderPane.setRight(imageView);

        final var scene = new Scene(borderPane, 640, 480);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void setupTableView() {

        final var columnModel = new TableColumn<Model, Integer>("Exemplar");
        columnModel.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getCode()));

        final var columnTitle = new TableColumn<Model, String>("Titulo");
        columnTitle.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getWork().getTitle()));

        final var columnAuthor = new TableColumn<Model, String>("Autor");
        columnAuthor.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getWork().getAuthor().getName()));

        final var columnEditor = new TableColumn<Model, String>("Editora");
        columnEditor.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(cellData.getValue().getWork().getPublisher().getName()));

        final var columnDelete = new TableColumn<Model, Void>("Delete");
        columnDelete.setCellFactory(new Callback<>() {
            @Override
            public TableCell<Model, Void> call(final TableColumn<Model, Void> param) {
                return new TableCell<>() {

                    private final Button button = new Button("Excluir");

                    {

                        button.setOnAction(e -> {

                            final var model = getTableView().getItems().get(getIndex());

                            if (model != null) {
                                modelDAO.removeModel(model);
                                originalData.remove(model);
                            }

                        });

                    }

                    @Override
                    public void updateItem(Void item, boolean empty) {
                        super.updateItem(item, empty);
                        if (empty) {
                            setGraphic(null);
                        } else {
                            setGraphic(button);
                        }
                    }

                };

            }
        });

        table.getColumns().addAll(columnModel, columnTitle, columnAuthor, columnEditor, columnDelete);
    }

    private void save(TextField fieldModel, TextField fieldTitle, ComboBox<Author> comboBoxAuthor, ComboBox<Publisher> comboBoxPublisher, TextField fieldEdition, TextField fieldYear) {

        try {

            final var year = Integer.parseInt(fieldYear.getText());
            final var edition = Integer.parseInt(fieldEdition.getText());
            final var modelCode = Integer.parseInt(fieldModel.getText());

            final var title = fieldTitle.getText();
            final var author = comboBoxAuthor.getValue();
            final var publisher = comboBoxPublisher.getValue();

            final var work = new Work(modelCode, title, author, publisher);
            final var newModel = new Model(work, modelCode, edition, year);

            modelDAO.addModel(newModel);
            originalData.add(newModel);

            // Limpa os campos após o salvamento
            fieldModel.clear();
            fieldTitle.clear();
            comboBoxAuthor.setValue(null);
            comboBoxPublisher.setValue(null);
            fieldEdition.clear();
            fieldYear.clear();

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

}
