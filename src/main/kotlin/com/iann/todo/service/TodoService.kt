package com.iann.todo.service

import com.iann.todo.dto.request.TodoRequest
import com.iann.todo.entity.Todo
import com.iann.todo.exception.BaseException
import com.iann.todo.exception.ResultCode
import com.iann.todo.repository.TodoRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class TodoService(
        private val todoRepository: TodoRepository
) {

    /**
     * 일정 등록
     */
    fun save(req: TodoRequest): Todo {
        return todoRepository.save(req.toEntity())
    }


    /**
     * 일정 목록
     */
    @Transactional(readOnly = true)
    fun findList() : List<Todo> {
        return todoRepository.findAll()
    }


    /**
     * 특정 일정 상세
     */
    @Transactional(readOnly = true)
    fun findOne(todoId: Long): Todo {
        val todo = todoRepository.findById(todoId).orElseThrow {
            BaseException(ResultCode.TODO_NOT_FOUND)
        }
        return todo
    }


    /**
     * 일정 삭제
     */
    @Transactional
    fun delete(todoId: Long) {
        todoRepository.findById(todoId).orElseThrow{
            BaseException(ResultCode.TODO_NOT_FOUND)
        }
        return todoRepository.deleteById(todoId)
    }


    /**
     * 일정 수정
     */
    @Transactional
    fun update(todoId: Long, req: TodoRequest): Todo {
        val todo = todoRepository.findById(todoId).orElseThrow {
            BaseException(ResultCode.TODO_NOT_FOUND)
        }
        todo.title = req.title
        todo.desc = req.desc
        todo.isComplete = req.isComplete
        todo.startDate = req.startDate
        todo.endDate = req.endDate
        return todoRepository.save(todo)
    }
}