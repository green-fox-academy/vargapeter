package com.example.mysql.controller;

import com.example.mysql.model.Todo;
import com.example.mysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
public class TodoController {

    private TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    @GetMapping(value = {"/", "/todo"})
    public String list(Model model, @RequestParam(required = false) Boolean isActive) {
        if (isActive == null) {
            model.addAttribute("todoList", todoRepository.findAll());
        } else {
            model.addAttribute("todoList", todoRepository.findAllByDone(isActive));
        }
        return "todo";
    }

    @PostMapping("/add-todo")
    public String addTodo(@ModelAttribute Todo todo) {
        todoRepository.save(todo);
        return "redirect:/";
    }

    @GetMapping("/add-todo-form")
    public String todoForm(Model model) {
        return "add-todo-form";
    }

    @GetMapping("/{id}/delete")
    public String delete(Model model, @PathVariable Long id) {
        todoRepository.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable Long id) {
        Optional<Todo> todo = todoRepository.findById(id);
        model.addAttribute("editTodo", todo.get());
        return "edit";
    }

    @PostMapping("/edit-todo")
    public String editTodo(@ModelAttribute Todo todo) {
        todoRepository.save(todo);
        return "redirect:/";
    }

    @PostMapping("/search-bar")
    public String searchBar(Model model, @RequestParam String searchedTodo) {
        List<Todo> listOfSearchedTodos = (List<Todo>)todoRepository.findAll();
        listOfSearchedTodos = listOfSearchedTodos.stream()
                .filter(t -> t.getTitle()
                        .toLowerCase()
                        .contains(searchedTodo.toLowerCase()))
                .collect(Collectors.toList());
        model.addAttribute("todoList", listOfSearchedTodos);
        if (listOfSearchedTodos.isEmpty()) {
            model.addAttribute("noItemMessage", "There is nothing to do");
        } else {
            model.addAttribute("noItemMessage", "");

        }
        return "todo";
    }





//    @Override
//    public void run(String... args) throws Exception {
//        todoRepository.save(new Todo("feladat"));
//    }

}
