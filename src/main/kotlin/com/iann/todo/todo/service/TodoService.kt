package com.iann.todo.todo.service

import com.iann.todo.todo.dto.request.TodoRequest
import com.iann.todo.todo.entity.Todo
import com.iann.todo.global.exception.BaseException
import com.iann.todo.global.exception.ResultCode
import com.iann.todo.todo.repository.TodoRepository
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
    fun findOne(id: Long): Todo {
        val todo = todoRepository.findById(id).orElseThrow {
            BaseException(ResultCode.TODO_NOT_FOUND)
        }
        return todo
    }


    /**
     * 일정 삭제
     */
    @Transactional
    fun delete(id: Long) {
        todoRepository.findById(id).orElseThrow{
            BaseException(ResultCode.TODO_NOT_FOUND)
        }
        return todoRepository.deleteById(id)
    }


    /**
     * 일정 수정
     */
    @Transactional
    fun update(id: Long, req: TodoRequest): Todo {
        val todo = todoRepository.findById(id).orElseThrow {
            BaseException(ResultCode.TODO_NOT_FOUND)
        }
        todo.title = req.title
        todo.desc = req.desc
        todo.isComplete = req.isComplete
        return todoRepository.save(todo)
    }
}